package chandu0101.scalajs.react.components.materialui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw._
import scala.scalajs.js
import scala.scalajs.js.annotation._
import chandu0101.scalajs.react.components._
import chandu0101.macros.tojs.JSMacro

//import chandu0101.macros.tojs.JSMacro

@JSImport("material-ui", "TextField") // If you're using modules
@js.native
object RawMuiTextField extends js.Object

@js.native
trait MuiTextFieldProps extends js.Object {
  var defaultValue: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var floatingLabelFixed: js.UndefOr[Boolean] = js.undefined
  var ref: js.UndefOr[MuiTextFieldM => Unit] = js.undefined
}

case class MuiTextField(
    key: js.UndefOr[String] = js.undefined,
    ref: js.UndefOr[MuiTextFieldM => Unit] = js.undefined,
    /* The css class name of the root element. */
    className: js.UndefOr[String] = js.undefined,
    /* The text string to use for the default value. */
    defaultValue: js.UndefOr[String] = js.undefined,
    /* Disables the text field if set to true. */
    disabled: js.UndefOr[Boolean] = js.undefined,
    /* The style object to use to override error styles. */
    errorStyle: js.UndefOr[CssProperties] = js.undefined,
    /* The error content to display. */
    errorText: js.UndefOr[ReactNode] = js.undefined,
    /* If true, the floating label will float even when there is no value. */
    floatingLabelFixed: js.UndefOr[Boolean] = js.undefined,
    /* The style object to use to override floating label styles when focused. */
    floatingLabelFocusStyle: js.UndefOr[CssProperties] = js.undefined,
    /* The style object to use to override floating label styles when shrunk. */
    floatingLabelShrinkStyle: js.UndefOr[CssProperties] = js.undefined,
    /* The style object to use to override floating label styles. */
    floatingLabelStyle: js.UndefOr[CssProperties] = js.undefined,
    /* The content to use for the floating label element. */
    floatingLabelText: js.UndefOr[ReactNode] = js.undefined,
    /* If true, the field receives the property width 100%. */
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    /* Override the inline-styles of the TextField's hint text element. */
    hintStyle: js.UndefOr[CssProperties] = js.undefined,
    /* The hint content to display. */
    hintText: js.UndefOr[ReactNode] = js.undefined,
    /* The id prop for the text field. */
    id: js.UndefOr[String] = js.undefined,
    /* Override the inline-styles of the TextField's input element.
     When multiLine is false: define the style of the input element.
     When multiLine is true: define the style of the container of the textarea. */
    inputStyle: js.UndefOr[CssProperties] = js.undefined,
    /* If true, a textarea element will be rendered.
     The textarea also grows and shrinks according to the number of lines. */
    multiLine: js.UndefOr[Boolean] = js.undefined,
    /* Name applied to the input. */
    name: js.UndefOr[String] = js.undefined,
    onBlur: js.UndefOr[ReactFocusEventFromInput => Callback] = js.undefined,
    /* Callback function that is fired when the textfield's value changes.
     @param {object} event Change event targeting the text field.
     @param {string} newValue The new value of the text field. */
    onChange: js.UndefOr[(ReactEventFromInput, String) => Callback] = js.undefined,
    onFocus: js.UndefOr[ReactFocusEventFromInput => Callback] = js.undefined,
    /* Number of rows to display when multiLine option is set to true. */
    rows: js.UndefOr[Int] = js.undefined,
    /* Maximum number of rows to display when
     multiLine option is set to true. */
    rowsMax: js.UndefOr[Int] = js.undefined,
    /* Override the inline-styles of the root element. */
    style: js.UndefOr[CssProperties] = js.undefined,
    /* Override the inline-styles of the TextField's textarea element.
     The TextField use either a textarea or an input,
     this property has effects only when multiLine is true. */
    textareaStyle: js.UndefOr[CssProperties] = js.undefined,
    /* Specifies the type of input to display
     such as "password" or "text". */
    `type`: js.UndefOr[String] = js.undefined,
    /* Override the inline-styles of the
     TextField's underline element when disabled. */
    underlineDisabledStyle: js.UndefOr[CssProperties] = js.undefined,
    /* Override the inline-styles of the TextField's
     underline element when focussed. */
    underlineFocusStyle: js.UndefOr[CssProperties] = js.undefined,
    /* If true, shows the underline for the text field. */
    underlineShow: js.UndefOr[Boolean] = js.undefined,
    /* Override the inline-styles of the TextField's underline element. */
    underlineStyle: js.UndefOr[CssProperties] = js.undefined,
    /* The value of the text field. */
    value: js.UndefOr[String] = js.undefined,
    /* (Passed on to EnhancedTextarea) */
    onHeightChange: js.UndefOr[(ReactEvent, Int) => Callback] = js.undefined,
    /* (Passed on to EnhancedTextarea) */
    shadowStyle: js.UndefOr[CssProperties] = js.undefined,
    /* (Passed on to EnhancedTextarea) */
    valueLink: js.UndefOr[js.Any] = js.undefined
) {
  def propFn(
    ref: js.UndefOr[MuiTextFieldM => Unit] = js.undefined,
    defaultValue: js.UndefOr[String] = js.undefined,
    key: js.UndefOr[String] = js.undefined,
    id: js.UndefOr[String] = js.undefined,
    floatingLabelFixed: js.UndefOr[Boolean] = js.undefined
  ): MuiTextFieldProps = {
    val p = (new js.Object).asInstanceOf[MuiTextFieldProps]
    p.ref = ref
    p.defaultValue = defaultValue
    p.key = key
    p.id = id
    p.floatingLabelFixed = floatingLabelFixed
    p
  }

  def apply(children: CtorType.ChildArg*) = {
    val props = propFn(ref, defaultValue, key, id, floatingLabelFixed)
    //val props = JSMacro[MuiTextField](this)

    val f = JsComponent[MuiTextFieldProps, Children.Varargs, Null](RawMuiTextField)
    f(props)(children: _*)
  }
}

@js.native
@JSGlobal
class MuiTextFieldM extends js.Object {
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getInputNode(): js.Dynamic = js.native
  def getValue(): String = js.native
  def select(): js.Dynamic = js.native
}
