# Acronym in Kotlin 🔤

![Status](https://img.shields.io/badge/status-finalizado-brightgreen)
![Kotlin](https://img.shields.io/badge/language-Kotlin-blue)

Projeto simples desenvolvido em **Kotlin** para gerar acrônimos automaticamente a partir de frases, com remoção de pontuação e suporte a hífens.

---

## ✨ Funcionalidade

- Converte uma frase em um acrônimo.
- Remove pontuação e caracteres especiais.
- Suporte a frases com hífens e letras maiúsculas/minúsculas.
- Código enxuto, usando `Regex` e `Locale`.

---

## 🧪 Exemplo de Uso

```kotlin
val phrases = listOf(
    "As Soon As Possible",
    "Liquid-crystal display",
    "Thank George It's Friday!"
)

for (phrase in phrases) {
    val acronym = Acronym.generate(phrase)
    println("$phrase -> $acronym")
}

💡 Saída esperada
As Soon As Possible -> ASAP
Liquid-crystal display -> LCD
Thank George It's Friday! -> TGIF
 
🧰 Requisitos
Recurso | Versão
Kotlin | 1.9+
JVM | Compatível
IDE | Android Studio / IntelliJ IDEA

▶️ Como Executar
git clone https://github.com/fernandorubini/Acronym-in-Kotlin.git
Abra o projeto em sua IDE e execute o arquivo Main.kt.

Feito com 💙 por Fernando Rubini


---

Se quiser, posso criar e subir esse README.md automaticamente com o commit pronto também. É só me avisar!

