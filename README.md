# SpringBoot-Linux
리눅스 환경에서 스프링 부트 실습

# 서버배포/운영
## 프로젝트 폴더 경로
- /docker_projects/sbdb_1/project

## 프로젝트 새로 구성
- rm -rf /docker_projects/sbdb_1/project
- mkdir -p /docker_projects/sbdb_1/project
- cd /docker_projects/sbdb_1/project
- git clone https://github.com/NeoGuRi95/SpringBoot-Linux
- chmod 744 ./gradlew

## 그래들 빌드
- ./gradlew clean build

## 현재 실행중인 컨테이너 중지 및 삭제
- docker stop sbdb_1
- 안되면 : docker kill sbdb_1
- docker rm -f sbdb_1

## 새 sbdb 이미지 만들기
- git pull origin master
- 그래드 빌드
- docker build -t sbdb .

## sbdb 이미지 실행
docker run \\
--name=sbdb_1 \\
-p 8080:8080 \\
-v /docker_projects/sbdb_1/volumes/gen:/gen \\
--restart unless-stopped \\
-e TZ=Asia/Seoul \\
-d \\
sbdb
