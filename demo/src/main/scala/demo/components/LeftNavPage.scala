package demo
package components

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scalacss.ProdDefaults._
import scalacss.ScalaCssReact._
import demo.routes.LeftRoute
import japgolly.scalajs.react.extra.router.RouterCtl

object LeftNavPage {

  object Style extends StyleSheet.Inline {
    import dsl._

    val container = style(
      display.flex,
      minHeight(600.px),
      paddingTop(64.px)
    )

    val nav = style(width(190.px))

    val content = style(
      padding(30.px),
      borderLeft :=! "1px solid rgb(223, 220, 220)",
      flex := "1"
    )
  }

  case class Backend($: BackendScope[Props, _]) {
    def render(P: Props) = {
      <.div(
        Style.container,
        <.div(Style.nav, LeftNav(P.menu, P.selectedPage, P.ctrl)),
        <.div(Style.content, P.selectedPage.render())
      )
    }
  }
  val component = ScalaComponent.builder[Props]("LeftNavPage")
    .renderBackend[Backend]
    .build

  case class Props(menu: List[LeftRoute], selectedPage: LeftRoute, ctrl: RouterCtl[LeftRoute])

  def apply(menu: List[LeftRoute], selectedPage: LeftRoute, ctrl: RouterCtl[LeftRoute]) = {
    component(Props(menu, selectedPage, ctrl))
    //    component.set(key, ref)(Props(menu, selectedPage, ctrl))
  }
}