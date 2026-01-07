# Usa uma imagem oficial do Java 17
FROM eclipse-temurin:17-jdk

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia todos os arquivos do projeto para o container
COPY . .

# Dá permissão de execução ao Maven wrapper (caso necessário)
RUN chmod +x mvnw

# Compila o projeto e gera o .jar
RUN ./mvnw clean package -DskipTests

# Expõe a porta padrão do Spring Boot
EXPOSE 8080

# Executa o .jar gerado
CMD ["java", "-jar", "MyLinktree-0.0.1-SNAPSHOT.jar"]
