#!/bin/sh
set -e

# If a .env file exists in /app, export its variables so Spring Boot can use them.
# This parser reads non-empty, non-comment lines and uses eval to expand any ${VAR} placeholders
# from the container's environment (which can be provided via docker run -e or --env-file).
if [ -f /app/.env ]; then
  while IFS= read -r line || [ -n "$line" ]; do
    # Trim leading/trailing whitespace
    trimmed=$(echo "$line" | sed -e 's/^[[:space:]]*//' -e 's/[[:space:]]*$//')
    # Skip empty lines and comments
    case "$trimmed" in
      ""|\#*) continue ;;
    esac
    # Export the variable. Using eval allows expansion of ${VAR} placeholders.
    # Example: if .env has DATA_SOURCE_URL=${DATA_SOURCE_URL}, and the runtime env
    # has DATA_SOURCE_URL set, this will export DATA_SOURCE_URL with that value.
    eval "export $trimmed"
  done < /app/.env
fi

# Default to 'dev' profile when none specified (can be overridden via env)
if [ -z "$SPRING_PROFILES_ACTIVE" ]; then
  SPRING_PROFILES_ACTIVE=dev
  export SPRING_PROFILES_ACTIVE
fi

# Execute the Java application (forward any extra args)
exec java -Djava.security.egd=file:/dev/./urandom -jar /app/model.jar "$@"
