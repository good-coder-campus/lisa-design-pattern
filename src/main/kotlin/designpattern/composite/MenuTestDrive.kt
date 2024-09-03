package designpattern.composite

class MenuTestDrive
fun main() {
    val pancakeHouseMenu = Menu("팬케이크 하우스 메뉴", "아침 메뉴")
    val dinerMenu = Menu("객체마을 식당 메뉴", "점심 메뉴")
    val cafeMenu = Menu("카페 메뉴", "저녁 메뉴")
    val dessertMenu = Menu("디저트 메뉴", "디저트를 즐겨 보세요!")

    val allMenus = Menu("전체 메뉴", "전체 메뉴")

    allMenus.add(pancakeHouseMenu)
    allMenus.add(dinerMenu)
    allMenus.add(cafeMenu)

    dinerMenu.add(MenuItem("파스타", "마리나라 소스 스파게티", true, 3.89))

    dessertMenu.add(MenuItem("애플 파이", "바삭바삭한 크러스트에 담백한 사과", true, 1.59))

    val waitress = Waitress(allMenus)
    waitress.printMenu()
}