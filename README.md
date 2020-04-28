## How To Use
1. 下载后建议在idea中打开
2. 检查设置enable annotation processing是否启用，lombok插件是否安装，jdk为1.8，redis相关参数设置在RedisPool类中（如果有非hardcode方法设置redis参数成功的请发pr，十分感谢）
3. 建议安装docker并使用mysql、redis等对应images，省心省力
4. 数据库及思路请参考[@daydreamdev](<https://github.com/daydreamdev>)的项目

## 代码优化

代码整体思路参考的 [@daydreamdev](<https://github.com/daydreamdev>)，做了以下几点变动

1. 修复了相关类的命名错误导致的编译问题
2. 修复了依赖版本问题导致的编译错误以及相关配置
3. 提高测试代码的适用性



## 参考
>- [基于 Springboot + Redis + Kafka 的秒杀系统](<https://github.com/daydreamdev/seconds-kill>)
>- [极客时间：许令波 - 如何设计一个秒杀系统](<https://time.geekbang.org/column/intro/127>)
>- [crossoverjie：SSM(十八)秒杀架构实践](<https://crossoverjie.top/2018/05/07/ssm/SSM18-seconds-kill/>)
>- [秒杀系统优化方案（下）吐血整理](<https://www.cnblogs.com/xiangkejin/p/9351501.html>)
>- [电商网站秒杀与抢购的系统架构](http://www.codeceo.com/article/spike-system-artch.html)
>- [使用缓存的正确姿势](<https://juejin.im/post/5af5b2c36fb9a07ac65318bd#heading-11>)
>- [SpringBoot Kafka 整合使用](<https://zhuanlan.zhihu.com/p/32780164>)
