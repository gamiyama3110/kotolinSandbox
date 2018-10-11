package sandbox.application.hoge

import tornadofx.Form
import tornadofx.View
import tornadofx.field
import tornadofx.fieldset


class HogehogeView : View("Hoge Viewer") {

    override val root = Form()

    init {
        with(root) {
            fieldset {
                field("hello hogehoge!!!")
            }
        }
    }
}