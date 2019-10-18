package com.thoughtworks.parkinglot.mockdb;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class UserRepostoryTest {
    @Test
    public void should_get_all_user_with_correct_pwd_crypt_with_MD5() throws NoSuchAlgorithmException {

        // given
        // when
        List<User> allUsers = UserRepostory.getAllUsers();

        // then
        Assert.assertEquals(BuildEncryptionPwd("1qaz2wsx3ed"), allUsers.get(0).getPwd());
        Assert.assertEquals(BuildEncryptionPwd("12345zxcvb"), allUsers.get(1).getPwd());
        Assert.assertEquals(BuildEncryptionPwd("12345678"), allUsers.get(2).getPwd());
        Assert.assertEquals(BuildEncryptionPwd("1q2w3e4r5t"), allUsers.get(3).getPwd());
        Assert.assertEquals(BuildEncryptionPwd("6y7u8i9o0p"), allUsers.get(4).getPwd());
        Assert.assertEquals(BuildEncryptionPwd("asdfghjklz"), allUsers.get(5).getPwd());
        Assert.assertEquals(BuildEncryptionPwd("zxcvbnmgh"), allUsers.get(6).getPwd());
        Assert.assertEquals(BuildEncryptionPwd("4567fgh"), allUsers.get(7).getPwd());
        Assert.assertEquals(BuildEncryptionPwd("cvbn7yg9i"), allUsers.get(8).getPwd());
        Assert.assertEquals(BuildEncryptionPwd("xdrtcft6vgy"), allUsers.get(9).getPwd());

    }

    private String BuildEncryptionPwd(String oringialPwd) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(oringialPwd.getBytes());
        byte[] digest = md.digest();
        return DatatypeConverter
                .printHexBinary(digest).toLowerCase();
    }
}
