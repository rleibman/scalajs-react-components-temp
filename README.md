# scalajs-react-components

This is not the real scalajs-react-components.

It's only a playground to try to migrate the real project into Scalajs-react 1.0.0

---------------------------------------------------------
Here are some notes on the progress:

- a lot of the components in the demo use key and ref... I'm not quite sure what to do with those,
particularly the ref. It seems to me that we can replace these with .withKey and .withRawProp
- I changed the build significantly, and I think in a good way. Not everything from the old build is ported,
but it's no longer using a Build.scala, it's all in build.sbt. But most importantly it's now using
sbt-scalajs-bundler, which is (I think) much cleaner than anything else for bundling js libraries.
You should use the fastOptJS::webpack sbt task to create the webpack bundle
- The only thing I've gotten to "work" so far is the MuiTextField, everything compiles, but it doesn't yet work

material-ui conversion
----------------------
I've made the MuiTextField work in a limited way, and it's currently hand written. I'm not quite sure how to
change the JSMacro to make it work correctly. Hopefully, @oyvindberg can help. Once I know how it needs to end up
I can work on the generation script