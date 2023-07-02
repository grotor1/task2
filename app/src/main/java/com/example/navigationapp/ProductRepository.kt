package com.example.navigationapp

object ProductRepository {
    val list: List<Product> = listOf(
        Product(1, "Phone", "Very good 5 stars buy please", "https://guide-images.cdn.ifixit.com/igi/o4OjCNmNeOhvsS1P.large"),
        Product(1, "Phone", "Very good 5 stars buy please", "https://guide-images.cdn.ifixit.com/igi/o4OjCNmNeOhvsS1P.large"),
        Product(1, "Phone", "Very good 5 stars buy please", "https://guide-images.cdn.ifixit.com/igi/o4OjCNmNeOhvsS1P.large"),
        Product(1, "Phone", "Very good 5 stars buy please", "https://guide-images.cdn.ifixit.com/igi/o4OjCNmNeOhvsS1P.large"),
        Product(1, "Phone", "Very good 5 stars buy please", "https://guide-images.cdn.ifixit.com/igi/o4OjCNmNeOhvsS1P.large"),
        Product(1, "Phone", "Very good 5 stars buy please", "https://guide-images.cdn.ifixit.com/igi/o4OjCNmNeOhvsS1P.large"),
        Product(1, "Phone", "Very good 5 stars buy please", "https://guide-images.cdn.ifixit.com/igi/o4OjCNmNeOhvsS1P.large"),
        Product(1, "Phone", "Very good 5 stars buy please", "https://guide-images.cdn.ifixit.com/igi/o4OjCNmNeOhvsS1P.large"),
        Product(1, "Phone", "Very good 5 stars buy please", "https://guide-images.cdn.ifixit.com/igi/o4OjCNmNeOhvsS1P.large"),
        Product(1, "Phone", "Very good 5 stars buy please", "https://guide-images.cdn.ifixit.com/igi/o4OjCNmNeOhvsS1P.large"),
        Product(1, "Phone", "Very good 5 stars buy please", "https://guide-images.cdn.ifixit.com/igi/o4OjCNmNeOhvsS1P.large"),
        Product(1, "Phone", "Very good 5 stars buy please", "https://guide-images.cdn.ifixit.com/igi/o4OjCNmNeOhvsS1P.large"),
        Product(1, "Phone", "Very good 5 stars buy please", "https://guide-images.cdn.ifixit.com/igi/o4OjCNmNeOhvsS1P.large"),
        Product(1, "Phone", "Very good 5 stars buy please", "https://guide-images.cdn.ifixit.com/igi/o4OjCNmNeOhvsS1P.large"),
        Product(1, "Phone", "Very good 5 stars buy please", "https://guide-images.cdn.ifixit.com/igi/o4OjCNmNeOhvsS1P.large"),
        Product(1, "Phone", "Very good 5 stars buy please", "https://guide-images.cdn.ifixit.com/igi/o4OjCNmNeOhvsS1P.large"),
        Product(1, "Phone", "Very good 5 stars buy please", "https://guide-images.cdn.ifixit.com/igi/o4OjCNmNeOhvsS1P.large"),
        Product(1, "Phone", "Very good 5 stars buy please", "https://guide-images.cdn.ifixit.com/igi/o4OjCNmNeOhvsS1P.large"),
        Product(1, "Phone", "Very good 5 stars buy please", "https://guide-images.cdn.ifixit.com/igi/o4OjCNmNeOhvsS1P.large"),
    )


    fun getById (id: Int) = list.find { product -> product.id == id }
}