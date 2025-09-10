@echo off
REM Script para enviar código Java para GitHub automaticamente

REM Solicita a URL do repositório
set /p REPO_URL=Digite a URL do repositório do GitHub: 

REM Configura usuário do Git (substitua pelos seus dados)
git config --global user.name "Pedro Rodrigues"
git config --global user.email "santospedro002@gmail.com"

REM Inicializa o repositório (caso ainda não exista)
git init

REM Adiciona todos os arquivos
git add .

REM Cria o commit
git commit -m "Primeira versão do Exercicio16"

REM Muda para branch main
git branch -M main

REM Remove o remote antigo se já existir
git remote remove origin 2>nul

REM Adiciona o remote
git remote add origin %REPO_URL%

REM Força o envio para o GitHub
git push -u origin main --force

echo.
echo Código enviado com sucesso para o GitHub!
pause
