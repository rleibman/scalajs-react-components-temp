package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw._
import scala.scalajs.js
import scala.scalajs.js.annotation._
import chandu0101.scalajs.react.components._
import chandu0101.macros.tojs.JSMacro

@JSImport("material-ui", "Paper") // If you're using modules
@js.native
object RawMuiPaper extends js.Object

@js.native
trait MuiPaperProps extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var ref: js.UndefOr[String] = js.undefined
  /* Set to true to generate a circlular paper container. */
  var circle: js.UndefOr[Boolean] = js.undefined
  /* By default the paper container will have a border radius.
	     Set this to false to generate a container with sharp corners. */
  var rounded: js.UndefOr[Boolean] = js.undefined
  /* Override the inline-styles of the root element. */
  var style: js.UndefOr[CssProperties] = js.undefined
  /* Set to false to disable CSS transitions for the paper element. */
  var transitionEnabled: js.UndefOr[Boolean] = js.undefined
  /* This number represents the zDepth of the paper shadow. */
  var zDepth: js.UndefOr[ZDepth] = js.undefined
}

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiPaper(
    key: js.UndefOr[String] = js.undefined,
    ref: js.UndefOr[String] = js.undefined,
    /* Set to true to generate a circlular paper container. */
    circle: js.UndefOr[Boolean] = js.undefined,
    /* By default, the paper container will have a border radius.
     Set this to false to generate a container with sharp corners. */
    rounded: js.UndefOr[Boolean] = js.undefined,
    /* Override the inline-styles of the root element. */
    style: js.UndefOr[CssProperties] = js.undefined,
    /* Set to false to disable CSS transitions for the paper element. */
    transitionEnabled: js.UndefOr[Boolean] = js.undefined,
    /* This number represents the zDepth of the paper shadow. */
    zDepth: js.UndefOr[ZDepth] = js.undefined
) {

  def propFn(
    key: js.UndefOr[String] = js.undefined,
    ref: js.UndefOr[String] = js.undefined,
    /* Set to true to generate a circlular paper container. */
    circle: js.UndefOr[Boolean] = js.undefined,
    /* By default, the paper container will have a border radius.
     Set this to false to generate a container with sharp corners. */
    rounded: js.UndefOr[Boolean] = js.undefined,
    /* Override the inline-styles of the root element. */
    style: js.UndefOr[CssProperties] = js.undefined,
    /* Set to false to disable CSS transitions for the paper element. */
    transitionEnabled: js.UndefOr[Boolean] = js.undefined,
    /* This number represents the zDepth of the paper shadow. */
    zDepth: js.UndefOr[ZDepth] = js.undefined
  ): MuiPaperProps = {
    val p = (new js.Object).asInstanceOf[MuiPaperProps]
    p.key = key
    p.ref = ref
    p.circle = circle
    p.rounded = rounded
    p.style = style
    p.transitionEnabled = transitionEnabled
    p.zDepth = zDepth
    p
  }

  def apply(children: CtorType.ChildArg*) = {
    val props = propFn(key, ref, circle, rounded, style, transitionEnabled, zDepth)
    //val props = JSMacro[MuiPaper](this)

    val f = JsComponent[MuiPaperProps, Children.Varargs, Null](RawMuiTextField)
    f(props)(children: _*)
  }

}