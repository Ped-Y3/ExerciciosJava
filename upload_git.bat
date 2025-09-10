@echo off
set /p REPO_URL=Digite a URL do repositório do GitHub: 

git init
git add .
git commit -m "Primeira versão do Exercicio1"
git branch -M main
git remote add origin %REPO_URL%
git push -u origin main

pause