package designpattern.proxy.virtualProxy

import java.awt.Component
import java.awt.Graphics
import java.net.URL
import javax.swing.Icon
import javax.swing.ImageIcon

class ImageProxy (
    @Volatile
    var imageIcon: ImageIcon? = null,
    var imageUrl: URL? = null,
    var retrievalThread: Thread,
    var retrieving: Boolean = false
): Icon {


    override fun paintIcon(c: Component?, g: Graphics?, x: Int, y: Int) {
        imageIcon?.paintIcon(c, g, x, y) ?: run {
            g?.apply {
                drawString("로딩 중...", x + 300, y + 190)
                if (!retrieving) {
                    retrieving = true
                    retrievalThread = Thread(Runnable {
                        try {
                            imageIcon = ImageIcon(imageUrl, "Album Cover")
                            c?.repaint()
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    })
                    retrievalThread.start()
                }
            }
        }
    }

    override fun getIconWidth(): Int {
        return imageIcon?.iconWidth ?: 800
    }

    override fun getIconHeight(): Int {
        return imageIcon?.iconHeight ?: 600
    }
}