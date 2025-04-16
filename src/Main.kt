import java.util.Locale

object Acronym {
    fun generate(phrase: String) : String {
        // Remove pontuação, exceto hífens, e converte para maiúsculas
        val cleanedPhrase = phrase.replace(Regex("[^A-Za-z0-9\\- ]"), "")
            .uppercase(Locale.US // ou Locale("pt", "BR")
            )

        // Divide a frase em palavras, usando espaços e hífens como separadores
        val words = cleanedPhrase.split(Regex("[\\s\\-]+"))

        // Extrai a primeira letra de cada palavra e junta as letras
        val acronym = words.map { it.first() }.joinToString("")

        return acronym
    }
}

fun main() {
    val phrases = listOf(
        "As Soon As Possible",
        "Liquid-crystal display",
        "Thank George It's Friday!"
    )

    for (phrase in phrases) {
        val acronym = Acronym.generate(phrase)
        println("$phrase -> $acronym")
    }
}