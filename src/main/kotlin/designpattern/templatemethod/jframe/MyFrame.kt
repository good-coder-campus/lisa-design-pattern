package designpattern.templatemethod.jframe

import java.awt.Graphics
import javax.swing.JFrame

class MyFrame(title: String) : JFrame(title) {

    init {
        this.defaultCloseOperation = EXIT_ON_CLOSE
        this.setSize(300, 300)
        this.isVisible = true
    }

    override fun paint(graphics: Graphics) {
        super.paint(graphics)
        val msg = "내가 최고"
        graphics.drawString(msg, 100, 100)
    }
}

fun main() {
    val myFrame = MyFrame("Head First Design Patterns")
}