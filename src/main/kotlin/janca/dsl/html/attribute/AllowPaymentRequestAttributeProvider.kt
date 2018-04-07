package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface AllowPaymentRequestAttributeProvider : IElement {
    var allowpaymentrequest: String?
        get() = this.getAttribute("allowpaymentrequest")
        set(value) = this.setAttribute("allowpaymentrequest", value)
}