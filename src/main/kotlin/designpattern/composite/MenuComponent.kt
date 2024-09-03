package designpattern.composite

/**
 * 이 중 어떤 메소드는 MenuItem 에서만 쓸 수 있고,
 * 어떤 메소드는 Menu 에서만 쓸 수 있어서
 * 기본적으로 예외를 던지도록 했음
 */
abstract class MenuComponent {
    open fun add(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun remove(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun getChild(i: Int): MenuComponent {
        throw UnsupportedOperationException()
    }

    open fun print() {
        throw UnsupportedOperationException()
    }
}