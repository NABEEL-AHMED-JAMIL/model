package com.barco.model.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;


/**
 * @author Nabeel Ahmed
 */
public class EncryptUtil {

    private Logger logger = LogManager.getLogger(EncryptUtil.class);

    private static String CIPHER = "AES/CBC/PKCS5PADDING";
    private static String appEncryptionKey = "2Fa38BxhVeBDnxJ3";
    private static String appEncryptionSecret = "7B8sjhAFJDuznPv7";
    private static String CHARSET_NAME = "UTF-8";
    private static String ALGORITHM = "AES";

    public static String encrypt(String value) {
        try {
            IvParameterSpec iv = new IvParameterSpec(appEncryptionSecret.getBytes(CHARSET_NAME));
            SecretKeySpec skeySpec = new SecretKeySpec(appEncryptionKey.getBytes(CHARSET_NAME), ALGORITHM);
            Cipher cipher = Cipher.getInstance(CIPHER);
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
            byte[] encrypted = cipher.doFinal(value.getBytes());
            return Base64.encodeBase64String(encrypted);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return value;
    }

    public static String decrypt(String encrypted) {
        try {
            IvParameterSpec iv = new IvParameterSpec(appEncryptionSecret.getBytes(CHARSET_NAME));
            SecretKeySpec skeySpec = new SecretKeySpec(appEncryptionKey.getBytes(CHARSET_NAME), ALGORITHM);
            Cipher cipher = Cipher.getInstance(CIPHER);
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
            byte[] original = cipher.doFinal(Base64.decodeBase64(encrypted));
            return new String(original);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return encrypted;
    }

}
