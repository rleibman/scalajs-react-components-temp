package demo

//import demo.components._
//import demo.components.materialui._
import demo.components._

import scalacss.ProdDefaults._
import scalacss.ScalaCssReact._
import scalacss.internal.mutable.GlobalRegistry

object AppCSS {
  def load(): Unit = {
    GlobalRegistry.register(
      LeftNav.Style,
      LeftNavPage.Style,
//      MuiButtonsDemo.Style,
//      MuiPaperDemo.Style,
//      MuiSwitchesDemo.Style,
//      MobileTearSheet.Style,
//      ReactTable.DefaultStyle,
//      ReactListView.DefaultStyle,
//      ReactSearchBox.DefaultStyle,
//      Pager.DefaultStyle,
//      ScalaCSSTutorial.Style,
//      InfoTemplate.Style,
//      ReactInfiniteDemo.styles,
//      ReactDraggable.Style,
//      MuiTabsDemo.Style
    )

    GlobalRegistry.addToDocumentOnRegistration()
  }
}