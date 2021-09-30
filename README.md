# github-actions-docker

github actions를 활용하여 docker 이미지를 빌드하고 push 한다. github actions와 docker를 활용한 CI 환경을 구축한다.

## 목표
 1. main branch가 push 되는 시점에 docker 이미지 빌드 후 docker hub로 push
 2. main을 제외한 작업 branch는 PR 등록 시점에 빌드 및 코드 커버리지 확인

## 사용 기술
 1. spring boot
 2. github actions
 3. docker
 4. jacoco
 5. codecov