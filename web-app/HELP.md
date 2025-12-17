# 이미지 빌드 후 올리는 명령어
docker buildx build \
--platform linux/amd64 \
--no-cache \
-t hyunmok/k3s-spring:latest \
--push \
.

# 마스터 토큰
K10d1f56f941ebb20fd5131188f9115ba465fc155e1e9b36f23bd55654ee9069356::server:ac6410abddb663c64cc4fca85be43268
