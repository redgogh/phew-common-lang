# v1.0.0-beta.1+build

  - 发布 v1.0.0-beta.1+build 测试版本。

# v1.0.1-beta.1+build

  - 新增 HttpClients 返回对象 Response。
  - 适配并兼容 JVM1.8 版本。
  - 新的 HttpClient API 设计。
  - 修复 AssertException 多个占位符格式化失败。

# v1.0.2-beta.1+build

  - 修复 HttpClient GET 不支持请求体问题。
  - 新增 Response 不同返回结果处理。
  - 新增 StringUtils#strip 字符串处理函数
  - 新增 atos 函数映射操作。
  - 新增 HttpClient#sslVerifierDisable 函数，禁用 SSL 校验。
  - 新增 HttpClient#newCall 异步调用接口。
  - 新增 testing 模块，用于模拟测试服务。
  - 新增 QueryBuilder 初始化传参。

# v1.0.3-beta.1+build

  - 新增 [ChanceMaker](libraries/tools/src/main/java/com/redgogh/tools/generators/ChanceMaker.java) 幸运值工具类。
  - 新增 [RandomGenerator](libraries/tools/src/main/java/com/redgogh/tools/generators/RandomGenerator.java) 随机数生成器。
  - 简化 Cryptographic 拼写，改名为：[Crypto](libraries%2Ftools%2Fsrc%2Fmain%2Fjava%2Fcom%2Fredgogh%2Ftools%2Fsecurity%2FCrypto.java)