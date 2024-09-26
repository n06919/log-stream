# Getting Started


# kafka start
```
# Generate a Cluster UUID
$ KAFKA_CLUSTER_ID="$(bin/kafka-storage.sh random-uuid)"
$ echo $KAFKA_CLUSTER_ID
# Format Log Directories
$ ./bin/kafka-storage.sh format -t $KAFKA_CLUSTER_ID -c config/kraft/server.properties


# Start the Kafka Server
$ ./bin/kafka-server-start.sh config/kraft/server.properties
```
## 프로그램 빌드
```shell
./gradlew build
```

## 프로그램 실행
```shell
# start producer
./gradlew runProducer

# start consumer
./gradlew runConsumer
```

### 로그 모니터링
```shell
# 로그 모니터링
http://localhost:8080/stream.html
```
![img.png](img.png)
### 로그 생성 테스트
```shell
# info 로그
curl -X GET http://localhost:8081/test/hello\?name\=tom

## error 로그
curl -X GET http://localhost:8081/test/hello\?name\=john


```

