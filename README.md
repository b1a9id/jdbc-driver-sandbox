# jdbc-driver-sandbox
JDBC ドライバーの検証

環境
- Java 17
- Spring Boot 3.1.0
- aws-mysql-jdbc 1.1.7
- aws-advanced-jdbc-wrapper 2.2.2

## 起動方法
1. 接続先DBのURLを環境変数に設定する。
```sh
$ export DB_URL=hoge.ap-northeast-1.rds.amazonaws.com
$ export RO_DB_URL=hoge-ro-.ap-northeast-1.rds.amazonaws.com
```

2. Spring Bootのアクティブプロファイルを指定して起動
```sh
# MySQL Connector/J
./gradlew clean bootRun --args='--spring.profiles.active=std'

# Amazon Web Services (AWS) JDBC Driver for MySQL
./gradlew clean bootRun --args='--spring.profiles.active=aws'

# Amazon Web Services (AWS) JDBC Driver
./gradlew clean bootRun --args='--spring.profiles.active=awswrapper'
```
