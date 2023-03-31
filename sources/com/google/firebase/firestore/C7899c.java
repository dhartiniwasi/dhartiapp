package com.google.firebase.firestore;

import java.util.Objects;
import p247h8.C10472x;

/* renamed from: com.google.firebase.firestore.c */
/* compiled from: AggregateQuerySnapshot */
public class C7899c {

    /* renamed from: a */
    private final long f34320a;

    /* renamed from: b */
    private final C7896b f34321b;

    C7899c(C7896b bVar, long j) {
        C10472x.m52785b(bVar);
        this.f34321b = bVar;
        this.f34320a = j;
    }

    /* renamed from: a */
    public long mo26322a() {
        return this.f34320a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7899c)) {
            return false;
        }
        C7899c cVar = (C7899c) obj;
        if (this.f34320a != cVar.f34320a || !this.f34321b.equals(cVar.f34321b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.f34320a), this.f34321b});
    }
}
