package p406y9;

import p248h9.C10476b;

/* renamed from: y9.c */
/* compiled from: DataMask */
enum C13224c {
    DATA_MASK_000 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo38326a(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    },
    DATA_MASK_001 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo38326a(int i, int i2) {
            return (i & 1) == 0;
        }
    },
    DATA_MASK_010 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo38326a(int i, int i2) {
            return i2 % 3 == 0;
        }
    },
    DATA_MASK_011 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo38326a(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    },
    DATA_MASK_100 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo38326a(int i, int i2) {
            return (((i / 2) + (i2 / 3)) & 1) == 0;
        }
    },
    DATA_MASK_101 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo38326a(int i, int i2) {
            return (i * i2) % 6 == 0;
        }
    },
    DATA_MASK_110 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo38326a(int i, int i2) {
            return (i * i2) % 6 < 3;
        }
    },
    DATA_MASK_111 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo38326a(int i, int i2) {
            return (((i + i2) + ((i * i2) % 3)) & 1) == 0;
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo38326a(int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo38327b(C10476b bVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (mo38326a(i2, i3)) {
                    bVar.mo33568c(i3, i2);
                }
            }
        }
    }
}
