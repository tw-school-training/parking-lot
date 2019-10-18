package com.thoughtworks.parkinglot.mockdb;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class UserRepositoryTest {
    @Test
    public void should_get_all_user_with_correct_pwd_crypt_with_MD5() throws NoSuchAlgorithmException {

        // given
        // when
        List<User> allUsers = UserRepository.getAllUsers();

        // then
        Assert.assertEquals(buildEncryptionPwd("1qaz2wsx3ed"), allUsers.get(0).getPwd());
        Assert.assertEquals(buildEncryptionPwd("12345zxcvb"), allUsers.get(1).getPwd());
        Assert.assertEquals(buildEncryptionPwd("12345678"), allUsers.get(2).getPwd());
        Assert.assertEquals(buildEncryptionPwd("1q2w3e4r5t"), allUsers.get(3).getPwd());
        Assert.assertEquals(buildEncryptionPwd("6y7u8i9o0p"), allUsers.get(4).getPwd());
        Assert.assertEquals(buildEncryptionPwd("asdfghjklz"), allUsers.get(5).getPwd());
        Assert.assertEquals(buildEncryptionPwd("zxcvbnmgh"), allUsers.get(6).getPwd());
        Assert.assertEquals(buildEncryptionPwd("4567fgh"), allUsers.get(7).getPwd());
        Assert.assertEquals(buildEncryptionPwd("cvbn7yg9i"), allUsers.get(8).getPwd());
        Assert.assertEquals(buildEncryptionPwd("xdrtcft6vgy"), allUsers.get(9).getPwd());

    }

    private String buildEncryptionPwd(String originalPwd) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(originalPwd.getBytes());
        byte[] digest = md.digest();
        return DatatypeConverter
                .printHexBinary(digest).toLowerCase();
    }
}
