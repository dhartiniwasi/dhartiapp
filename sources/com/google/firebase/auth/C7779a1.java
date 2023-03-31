package com.google.firebase.auth;

import p033d5.C4141r;
import p218e6.C9959a;
import p218e6.C9975i;

/* renamed from: com.google.firebase.auth.a1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C7779a1 implements C9959a {

    /* renamed from: a */
    final /* synthetic */ String f34096a;

    /* renamed from: b */
    final /* synthetic */ C7793e f34097b;

    /* renamed from: c */
    final /* synthetic */ C7869z f34098c;

    C7779a1(C7869z zVar, String str, C7793e eVar) {
        this.f34098c = zVar;
        this.f34096a = str;
        this.f34097b = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo279a(C9975i iVar) throws Exception {
        return FirebaseAuth.getInstance(this.f34098c.mo26244d2()).mo26029k0((String) C4141r.m28221k(((C7782b0) iVar.mo26358m()).mo26059g()), this.f34096a, this.f34097b);
    }
}
