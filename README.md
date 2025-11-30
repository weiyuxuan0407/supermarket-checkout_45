# supermarket-checkout_45
一款轻量化、易部署的中小超市收银系统，聚焦核心收银场景，支持商品扫码计价、多方式结算、小票打印、简易对账等功能，适配中小社区超市 / 便利店的低成本、高效率需求。

项目介绍
核心特性
轻量化部署：基于 Java + SQLite 开发，无需复杂环境配置，本地即可运行；
核心收银功能：支持条码扫码 / 手动输入计价、现金 / 微信 / 支付宝多支付方式结算；
小票打印：适配主流小票机，支持自定义小票抬头、商品明细、金额等信息；
简易对账：按日统计收款金额，自动生成对账报表，减少人工核对成本；
离线可用：本地数据库存储数据，无网络环境下正常完成收银操作。

技术栈
后端：Java（JDK 8+）、MyBatis、SQLite
前端：HTML + CSS + JavaScript、LayUI
工具：Maven（项目构建）、Git（版本管理）

环境要求
JDK 8 及以上版本
Maven 3.6+
任意主流操作系统（Windows/macOS/Linux）

部署步骤:
克隆仓库到本地
git clone git@github.com:weiyuxuan0407/supermarket-checkout_45.git
cd supermarket-checkout_45
编译项目
mvn clean package
运行程序
java -jar target/supermarket-checkout-1.0-SNAPSHOT.jar
目录结构
supermarket-checkout_45/
├── src/main/java/com/weiyuxuan/  # 核心业务代码
│   ├── controller/               # 接口控制层
│   ├── service/                  # 业务逻辑层
│   ├── mapper/                   # 数据访问层
│   ├── entity/                   # 实体类
│   └── util/                     # 工具类
├── src/main/resources/           # 配置文件
│   ├── mybatis/                  # MyBatis映射文件
│   └── application.yml           # 系统配置
├── src/main/webapp/              # 前端页面
└── pom.xml                       # Maven依赖配置

许可证
本项目采用 MIT License 开源许可证，你可以自由使用、修改、分发本项目代码，商用无需额外授权（需保留许可证声明）。

问题反馈
若使用过程中遇到问题，可通过 GitHub Issues 提交反馈，反馈时请注明：
操作系统版本；

复现步骤；
报错日志 / 截图。

免责声明
本项目仅用于学习和中小超市日常收银场景，请勿用于商业核心系统高并发场景；使用本项目产生的一切数据安全、资金风险等问题，均由使用者自行承担。
