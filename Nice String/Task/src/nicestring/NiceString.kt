package nicestring

fun String.isNice(): Boolean {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')

    val notStrings = !this.contains("bu") && !this.contains("ba") && !this.contains("be")
    val containsVowels = this.count { it -> vowels.contains(it) } >=3

    var containsDoubledChar = false
    this.forEachIndexed { index, element ->
        if (index != 0)
            if (this.get(index-1)==element){
                containsDoubledChar = true
            }
    }
    return listOf(notStrings, containsVowels, containsDoubledChar).count { it } >=2
}