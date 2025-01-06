package org.redgogh.cleantools.crypto.codec;

import org.redgogh.cleantools.base.Capturer;
import org.redgogh.cleantools.crypto.Crypto;
import org.redgogh.cleantools.crypto.SHA256;
import org.redgogh.cleantools.exception.SystemRuntimeException;
import org.redgogh.cleantools.io.IOUtils;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * @author RedGogh
 */
public class SHA256Codec implements SHA256 {

    @Override
    public String encode(String source) {
        return encode(source.getBytes(StandardCharsets.UTF_8));
    }

    @Override
    @SuppressWarnings("resource")
    public String encode(File f0) {
        return Capturer.icall(() -> {
            org.redgogh.cleantools.io.File file = new org.redgogh.cleantools.io.File(f0);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            file.openByteReader().call(reader -> {
                int len = 0;
                byte[] buffer = new byte[IOUtils.MB];
                while ((len = reader.read(buffer)) != IOUtils.EOF)
                    messageDigest.update(buffer, 0, len);
            });
            return Crypto.toByteHex(messageDigest.digest());
        });
    }

    @Override
    public String encode(byte[] source) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(source);
            return Crypto.toByteHex(messageDigest.digest());
        } catch (Exception e) {
            throw new SystemRuntimeException(e);
        }
    }

}