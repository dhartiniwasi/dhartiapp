package com.google.protobuf;

import com.google.protobuf.C8243v0;

/* renamed from: com.google.protobuf.b */
/* compiled from: AbstractParser */
public abstract class C8100b<MessageType extends C8243v0> implements C8143f1<MessageType> {

    /* renamed from: a */
    private static final C8210q f34804a = C8210q.m45546b();

    /* renamed from: d */
    private MessageType m44570d(MessageType messagetype) throws C8135e0 {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw m44571e(messagetype).mo27294a().mo26894k(messagetype);
    }

    /* renamed from: e */
    private C8239u1 m44571e(MessageType messagetype) {
        if (messagetype instanceof C8088a) {
            return ((C8088a) messagetype).mo26776o();
        }
        return new C8239u1(messagetype);
    }

    /* renamed from: f */
    public MessageType mo26795a(C8153i iVar, C8210q qVar) throws C8135e0 {
        return m44570d(mo26799h(iVar, qVar));
    }

    /* renamed from: g */
    public MessageType mo26796b(C8167j jVar, C8210q qVar) throws C8135e0 {
        return m44570d((C8243v0) mo26898c(jVar, qVar));
    }

    /* renamed from: h */
    public MessageType mo26799h(C8153i iVar, C8210q qVar) throws C8135e0 {
        MessageType messagetype;
        try {
            C8167j B = iVar.mo26878B();
            messagetype = (C8243v0) mo26898c(B, qVar);
            B.mo26971a(0);
            return messagetype;
        } catch (C8135e0 e) {
            throw e.mo26894k(messagetype);
        } catch (C8135e0 e2) {
            throw e2;
        }
    }
}
