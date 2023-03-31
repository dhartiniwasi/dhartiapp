package com.google.protobuf;

import java.util.List;

/* renamed from: com.google.protobuf.u1 */
/* compiled from: UninitializedMessageException */
public class C8239u1 extends RuntimeException {

    /* renamed from: a */
    private final List<String> f35084a = null;

    public C8239u1(C8243v0 v0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public C8135e0 mo27294a() {
        return new C8135e0(getMessage());
    }
}
