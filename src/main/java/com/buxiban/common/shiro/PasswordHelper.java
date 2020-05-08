package com.buxiban.common.shiro;

import com.buxiban.system.entity.SysUser;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * @Package: com.buxiban.common.utils
 * @Author: ch3nw3i@github
 * @Date: 2020-05-01 0:46
 */
public class PasswordHelper {
    private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
    public static final String ALGORITHM_NAME = "md5"; // 基础散列算法
    public static final int HASH_ITERATIONS = 2; // 自定义散列次数

    public void encryptPassword(SysUser sysUser) {
        // 随机字符串作为salt因子，实际参与运算的salt我们还引入其它干扰因子
        sysUser.setSalt(randomNumberGenerator.nextBytes().toHex());
        String newPassword = new SimpleHash(ALGORITHM_NAME, sysUser.getPassword(),
                ByteSource.Util.bytes(sysUser.getSalt()), HASH_ITERATIONS).toHex();
        sysUser.setPassword(newPassword);
    }
}
