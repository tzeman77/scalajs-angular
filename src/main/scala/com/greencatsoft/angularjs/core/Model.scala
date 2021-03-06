package com.greencatsoft.angularjs.core

import scala.scalajs.js
import scala.scalajs.js.UndefOr

trait ModelController extends js.Object {

  var $viewValue: UndefOr[String] = js.native

  var $modelValue: js.Any = js.native

  var $parsers: js.Array[js.Function] = js.native

  var $formatters: js.Array[js.Function] = js.native

  var $validators: js.Dictionary[js.Function] = js.native

  var $asyncValidators: js.Dictionary[js.Function2[js.Any, UndefOr[String], Promise[_]]] = js.native

  def $setValidity(validationErrorKey: String, isValid: Boolean): Unit = js.native

  var $viewChangeListeners: js.Array[js.Function] = js.native

  var $error: js.Dictionary[js.Any] = js.native

  var $pending: js.Dictionary[js.Any] = js.native

  var $untouched: Boolean = js.native

  var $touched: Boolean = js.native

  var $pristine: Boolean = js.native

  var $dirty: Boolean = js.native

  var $valid: Boolean = js.native

  var $invalid: Boolean = js.native

  var $name: String = js.native
}