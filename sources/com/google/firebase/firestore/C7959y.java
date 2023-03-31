package com.google.firebase.firestore;

import android.util.SparseArray;
import p246h7.C10421l;
import p247h8.C10432b;
import p247h8.C10472x;

/* renamed from: com.google.firebase.firestore.y */
/* compiled from: FirebaseFirestoreException */
public class C7959y extends C10421l {

    /* renamed from: a */
    private final C7960a f34434a;

    /* renamed from: com.google.firebase.firestore.y$a */
    /* compiled from: FirebaseFirestoreException */
    public enum C7960a {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        

        /* renamed from: A */
        private static final SparseArray<C7960a> f34435A = null;

        /* renamed from: a */
        private final int f34454a;

        static {
            f34435A = m43893a();
        }

        private C7960a(int i) {
            this.f34454a = i;
        }

        /* renamed from: a */
        private static SparseArray<C7960a> m43893a() {
            SparseArray<C7960a> sparseArray = new SparseArray<>();
            C7960a[] values = values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                C7960a aVar = values[i];
                C7960a aVar2 = sparseArray.get(aVar.mo26470c());
                if (aVar2 == null) {
                    sparseArray.put(aVar.mo26470c(), aVar);
                    i++;
                } else {
                    throw new IllegalStateException("Code value duplication between " + aVar2 + "&" + aVar.name());
                }
            }
            return sparseArray;
        }

        /* renamed from: b */
        public static C7960a m43894b(int i) {
            return f34435A.get(i, UNKNOWN);
        }

        /* renamed from: c */
        public int mo26470c() {
            return this.f34454a;
        }
    }

    public C7959y(String str, C7960a aVar) {
        super(str);
        C10472x.m52786c(str, "Provided message must not be null.");
        C10432b.m52648d(aVar != C7960a.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.f34434a = (C7960a) C10472x.m52786c(aVar, "Provided code must not be null.");
    }

    /* renamed from: a */
    public C7960a mo26469a() {
        return this.f34434a;
    }

    public C7959y(String str, C7960a aVar, Throwable th) {
        super(str, th);
        C10472x.m52786c(str, "Provided message must not be null.");
        C10432b.m52648d(aVar != C7960a.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.f34434a = (C7960a) C10472x.m52786c(aVar, "Provided code must not be null.");
    }
}
