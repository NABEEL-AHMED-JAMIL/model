# Use a slim OpenJDK runtime image
FROM openjdk:11-jre-slim

# Maintainer label
LABEL maintainer="nabeel.amd93@gmail.com"

# Argument to pass the JAR file from build context
ARG JAR_FILE=target/*.jar

# Create app directory and set it as the working directory
WORKDIR /app

# Copy the JAR file into the container (destination: /app/model.jar)
COPY ${JAR_FILE} model.jar

# Copy the entrypoint script
COPY docker-entrypoint.sh /app/docker-entrypoint.sh

# Make the entrypoint executable
RUN chmod +x /app/docker-entrypoint.sh || true

# Note: we intentionally do NOT copy .env into the image to avoid baking secrets.
# Provide runtime env via --env-file or mount a file at /app/.env.

# Create a volume for temporary files
VOLUME /tmp

# Expose application port
EXPOSE 9098

# Use the entrypoint script which will export variables from /app/.env (if present) and run the jar
ENTRYPOINT ["/app/docker-entrypoint.sh"]
