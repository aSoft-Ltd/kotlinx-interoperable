@file:OptIn(ExperimentalMultiplatform::class)

package kotlinx

@Retention(AnnotationRetention.BINARY)
@Target(AnnotationTarget.CLASS, AnnotationTarget.PROPERTY, AnnotationTarget.FUNCTION, AnnotationTarget.FILE)
@OptionalExpectation
expect annotation class JsExport()