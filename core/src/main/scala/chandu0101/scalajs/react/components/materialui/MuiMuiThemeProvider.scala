package chandu0101.scalajs.react.components.materialui
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw._
import scala.scalajs.js
import scala.scalajs.js.annotation._
import japgolly.scalajs.react._

/**
 * This file is generated - submit issues instead of PR against it
 */
@JSImport("material-ui/styles", "MuiThemeProvider") // If you're using modules
@js.native
object RawMuiMuiThemeProvider extends js.Object

@js.native
trait MuiMuiThemeProviderProps extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var ref: js.UndefOr[MuiMuiThemeProviderM => Unit] = js.undefined
  var muiTheme: js.UndefOr[MuiTheme] = js.undefined
}

case class MuiMuiThemeProvider(
    key: js.UndefOr[String] = js.undefined,
    ref: js.UndefOr[MuiMuiThemeProviderM => Unit] = js.undefined,
    muiTheme: js.UndefOr[MuiTheme] = js.undefined
) {

  def propFn(
    key: js.UndefOr[String] = js.undefined,
    ref: js.UndefOr[MuiMuiThemeProviderM => Unit] = js.undefined,
    muiTheme: js.UndefOr[MuiTheme] = js.undefined
  ): MuiMuiThemeProviderProps = {
    val p = (new js.Object).asInstanceOf[MuiMuiThemeProviderProps]
    p.key = key
    p.ref = ref
    p.muiTheme = muiTheme
    p
  }

  def apply(children: CtorType.ChildArg*) = {
    val props = propFn(key, ref, muiTheme)
    val f = JsComponent[MuiMuiThemeProviderProps, Children.Varargs, Null](RawMuiMuiThemeProvider)
    f(props)(children: _*)
  }
}

@js.native
@JSGlobal
class MuiMuiThemeProviderM extends js.Object {
  def getChildContext(): js.Dynamic = js.native
}
