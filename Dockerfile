FROM maven:3.8.5-openjdk-17-slim

WORKDIR /ms_user
COPY . .

# Set environment variables
ENV DATABASE_URL_TEST=$DATABASE_URL_TEST \
    DATABASE_USER_TEST=$DATABASE_USER_TEST \
    DATABASE_PASS_TEST=$DATABASE_PASS_TEST \
    JWT_SECRET=$JWT_SECRET

RUN mvn clean install

CMD mvn spring-boot:run