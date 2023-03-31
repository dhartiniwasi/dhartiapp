package p233fc;

import android.util.Log;
import com.google.firebase.firestore.C7900c0;
import com.google.firebase.firestore.C7903e;
import com.google.firebase.firestore.C7907g;
import com.google.firebase.firestore.C7913h0;
import com.google.firebase.firestore.C7921l;
import com.google.firebase.firestore.C7923m;
import com.google.firebase.firestore.C7929o0;
import com.google.firebase.firestore.C7932p;
import com.google.firebase.firestore.C7934q;
import com.google.firebase.firestore.C7940q0;
import com.google.firebase.firestore.C7949t0;
import com.google.firebase.firestore.C7964z;
import com.google.firebase.firestore.FirebaseFirestore;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p186ac.C6568r;
import p246h7.C10412f;
import p246h7.C10428q;

/* renamed from: fc.b */
/* compiled from: FlutterFirebaseFirestoreMessageCodec */
class C10178b extends C6568r {

    /* renamed from: d */
    public static final C10178b f40587d = new C10178b();

    /* renamed from: fc.b$a */
    /* compiled from: FlutterFirebaseFirestoreMessageCodec */
    static /* synthetic */ class C10179a {

        /* renamed from: a */
        static final /* synthetic */ int[] f40588a;

        /* renamed from: b */
        static final /* synthetic */ int[] f40589b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.google.firebase.firestore.h0$a[] r0 = com.google.firebase.firestore.C7913h0.C7914a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40589b = r0
                r1 = 1
                com.google.firebase.firestore.h0$a r2 = com.google.firebase.firestore.C7913h0.C7914a.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f40589b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.h0$a r3 = com.google.firebase.firestore.C7913h0.C7914a.SUCCESS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f40589b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.h0$a r4 = com.google.firebase.firestore.C7913h0.C7914a.ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.firebase.firestore.g$b[] r3 = com.google.firebase.firestore.C7907g.C7909b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f40588a = r3
                com.google.firebase.firestore.g$b r4 = com.google.firebase.firestore.C7907g.C7909b.ADDED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f40588a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.firestore.g$b r3 = com.google.firebase.firestore.C7907g.C7909b.MODIFIED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f40588a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.google.firebase.firestore.g$b r1 = com.google.firebase.firestore.C7907g.C7909b.REMOVED     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p233fc.C10178b.C10179a.<clinit>():void");
        }
    }

    C10178b() {
    }

    /* renamed from: q */
    private FirebaseFirestore m51627q(ByteBuffer byteBuffer) {
        String str = (String) mo22175f(byteBuffer);
        C7964z zVar = (C7964z) mo22175f(byteBuffer);
        synchronized (C10199v.f40630i) {
            if (C10199v.m51645F(str) != null) {
                FirebaseFirestore F = C10199v.m51645F(str);
                return F;
            }
            FirebaseFirestore u = FirebaseFirestore.m43649u(C10412f.m52583p(str));
            u.mo26290K(zVar);
            C10199v.m51681h0(u, str);
            return u;
        }
    }

    /* renamed from: r */
    private C7929o0 m51628r(ByteBuffer byteBuffer) {
        C7929o0 o0Var;
        try {
            Map map = (Map) mo22175f(byteBuffer);
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj;
            Object obj2 = map.get("path");
            Objects.requireNonNull(obj2);
            String str = (String) obj2;
            boolean booleanValue = ((Boolean) map.get("isCollectionGroup")).booleanValue();
            Map map2 = (Map) map.get("parameters");
            if (booleanValue) {
                o0Var = firebaseFirestore.mo26300m(str);
            } else {
                o0Var = firebaseFirestore.mo26299l(str);
            }
            if (map2 == null) {
                return o0Var;
            }
            Object obj3 = map2.get("where");
            Objects.requireNonNull(obj3);
            for (List list : (List) obj3) {
                C7932p pVar = (C7932p) list.get(0);
                String str2 = (String) list.get(1);
                Object obj4 = list.get(2);
                if ("==".equals(str2)) {
                    o0Var = o0Var.mo26408M(pVar, obj4);
                } else if ("!=".equals(str2)) {
                    o0Var = o0Var.mo26414S(pVar, obj4);
                } else if ("<".equals(str2)) {
                    o0Var = o0Var.mo26412Q(pVar, obj4);
                } else if ("<=".equals(str2)) {
                    o0Var = o0Var.mo26413R(pVar, obj4);
                } else if (">".equals(str2)) {
                    o0Var = o0Var.mo26409N(pVar, obj4);
                } else if (">=".equals(str2)) {
                    o0Var = o0Var.mo26410O(pVar, obj4);
                } else if ("array-contains".equals(str2)) {
                    o0Var = o0Var.mo26406K(pVar, obj4);
                } else if ("array-contains-any".equals(str2)) {
                    o0Var = o0Var.mo26407L(pVar, (List) obj4);
                } else if ("in".equals(str2)) {
                    o0Var = o0Var.mo26411P(pVar, (List) obj4);
                } else if ("not-in".equals(str2)) {
                    o0Var = o0Var.mo26415T(pVar, (List) obj4);
                } else {
                    Log.w("FLTFirestoreMsgCodec", "An invalid query operator " + str2 + " was received but not handled.");
                }
            }
            Number number = (Number) map2.get("limit");
            if (number != null) {
                o0Var = o0Var.mo26425t(number.longValue());
            }
            Number number2 = (Number) map2.get("limitToLast");
            if (number2 != null) {
                o0Var = o0Var.mo26426u(number2.longValue());
            }
            List<List> list2 = (List) map2.get("orderBy");
            if (list2 == null) {
                return o0Var;
            }
            for (List list3 : list2) {
                o0Var = o0Var.mo26427v((C7932p) list3.get(0), ((Boolean) list3.get(1)).booleanValue() ? C7929o0.C7931b.DESCENDING : C7929o0.C7931b.ASCENDING);
            }
            List list4 = (List) map2.get("startAt");
            if (list4 != null) {
                Object[] array = list4.toArray();
                Objects.requireNonNull(array);
                o0Var = o0Var.mo26404C(array);
            }
            List list5 = (List) map2.get("startAfter");
            if (list5 != null) {
                Object[] array2 = list5.toArray();
                Objects.requireNonNull(array2);
                o0Var = o0Var.mo26403B(array2);
            }
            List list6 = (List) map2.get("endAt");
            if (list6 != null) {
                Object[] array3 = list6.toArray();
                Objects.requireNonNull(array3);
                o0Var = o0Var.mo26421j(array3);
            }
            List list7 = (List) map2.get("endBefore");
            if (list7 == null) {
                return o0Var;
            }
            Object[] array4 = list7.toArray();
            Objects.requireNonNull(array4);
            return o0Var.mo26422k(array4);
        } catch (Exception e) {
            Log.e("FLTFirestoreMsgCodec", "An error occurred while parsing query arguments, this is most likely an error with this SDK.", e);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Long} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.firebase.firestore.C7964z m51629s(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            java.lang.Object r8 = r7.mo22175f(r8)
            java.util.Map r8 = (java.util.Map) r8
            com.google.firebase.firestore.z$b r0 = new com.google.firebase.firestore.z$b
            r0.<init>()
            java.lang.String r1 = "persistenceEnabled"
            java.lang.Object r2 = r8.get(r1)
            if (r2 == 0) goto L_0x0023
            java.lang.Object r1 = r8.get(r1)
            java.util.Objects.requireNonNull(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.mo26487h(r1)
        L_0x0023:
            java.lang.String r1 = "host"
            java.lang.Object r2 = r8.get(r1)
            if (r2 == 0) goto L_0x004f
            java.lang.Object r1 = r8.get(r1)
            java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.mo26486g(r1)
            java.lang.String r1 = "sslEnabled"
            java.lang.Object r2 = r8.get(r1)
            if (r2 == 0) goto L_0x004f
            java.lang.Object r1 = r8.get(r1)
            java.util.Objects.requireNonNull(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.mo26488i(r1)
        L_0x004f:
            java.lang.String r1 = "cacheSizeBytes"
            java.lang.Object r2 = r8.get(r1)
            if (r2 == 0) goto L_0x008e
            r2 = 104857600(0x6400000, double:5.1806538E-316)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r8 = r8.get(r1)
            boolean r1 = r8 instanceof java.lang.Long
            if (r1 == 0) goto L_0x006a
            r2 = r8
            java.lang.Long r2 = (java.lang.Long) r2
            goto L_0x0079
        L_0x006a:
            boolean r1 = r8 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0079
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            long r1 = (long) r8
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x0079:
            long r3 = r2.longValue()
            r5 = -1
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x0087
            r0.mo26485f(r5)
            goto L_0x008e
        L_0x0087:
            long r1 = r2.longValue()
            r0.mo26485f(r1)
        L_0x008e:
            com.google.firebase.firestore.z r8 = r0.mo26484e()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p233fc.C10178b.m51629s(java.nio.ByteBuffer):com.google.firebase.firestore.z");
    }

    /* renamed from: t */
    private Object[] m51630t(Object obj) {
        if (obj instanceof List) {
            return ((List) obj).toArray();
        }
        if (obj == null) {
            return new ArrayList().toArray();
        }
        throw new IllegalArgumentException(String.format("java.util.List was expected, unable to convert '%s' to an object array", new Object[]{obj.getClass().getCanonicalName()}));
    }

    /* renamed from: u */
    private void m51631u(ByteArrayOutputStream byteArrayOutputStream, C7907g gVar) {
        HashMap hashMap = new HashMap();
        int i = C10179a.f40588a[gVar.mo26343e().ordinal()];
        hashMap.put("type", i != 1 ? i != 2 ? i != 3 ? null : "DocumentChangeType.removed" : "DocumentChangeType.modified" : "DocumentChangeType.added");
        hashMap.put(JsonStorageKeyNames.DATA_KEY, gVar.mo26340b().mo26396d());
        hashMap.put("path", gVar.mo26340b().mo26400g().mo26391m());
        hashMap.put("oldIndex", Integer.valueOf(gVar.mo26342d()));
        hashMap.put("newIndex", Integer.valueOf(gVar.mo26341c()));
        hashMap.put("metadata", gVar.mo26340b().mo26399f());
        mo22177p(byteArrayOutputStream, hashMap);
    }

    /* renamed from: v */
    private void m51632v(ByteArrayOutputStream byteArrayOutputStream, C7923m mVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("path", mVar.mo26400g().mo26391m());
        if (mVar.mo26395a()) {
            C7923m.C7924a aVar = C10199v.f40631r.get(Integer.valueOf(mVar.hashCode()));
            if (aVar != null) {
                hashMap.put(JsonStorageKeyNames.DATA_KEY, mVar.mo26397e(aVar));
            } else {
                hashMap.put(JsonStorageKeyNames.DATA_KEY, mVar.mo26396d());
            }
        } else {
            hashMap.put(JsonStorageKeyNames.DATA_KEY, (Object) null);
        }
        hashMap.put("metadata", mVar.mo26399f());
        C10199v.f40631r.remove(Integer.valueOf(mVar.hashCode()));
        mo22177p(byteArrayOutputStream, hashMap);
    }

    /* renamed from: w */
    private void m51633w(ByteArrayOutputStream byteArrayOutputStream, C7913h0 h0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("bytesLoaded", Long.valueOf(h0Var.mo26374c()));
        hashMap.put("documentsLoaded", Integer.valueOf(h0Var.mo26375d()));
        hashMap.put("totalBytes", Long.valueOf(h0Var.mo26378f()));
        hashMap.put("totalDocuments", Integer.valueOf(h0Var.mo26379g()));
        int i = C10179a.f40589b[h0Var.mo26376e().ordinal()];
        String str = "running";
        if (i != 1) {
            if (i == 2) {
                str = "success";
            } else if (i == 3) {
                str = "error";
            }
        }
        hashMap.put("taskState", str);
        mo22177p(byteArrayOutputStream, hashMap);
    }

    /* renamed from: x */
    private void m51634x(ByteArrayOutputStream byteArrayOutputStream, C7940q0 q0Var) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C7923m.C7924a aVar = C10199v.f40631r.get(Integer.valueOf(q0Var.hashCode()));
        for (C7923m next : q0Var.mo26441j()) {
            arrayList.add(next.mo26400g().mo26391m());
            if (aVar != null) {
                arrayList2.add(next.mo26397e(aVar));
            } else {
                arrayList2.add(next.mo26396d());
            }
            arrayList3.add(next.mo26399f());
        }
        hashMap.put("paths", arrayList);
        hashMap.put("documents", arrayList2);
        hashMap.put("metadatas", arrayList3);
        hashMap.put("documentChanges", q0Var.mo26437f());
        hashMap.put("metadata", q0Var.mo26442k());
        C10199v.f40631r.remove(Integer.valueOf(q0Var.hashCode()));
        mo22177p(byteArrayOutputStream, hashMap);
    }

    /* renamed from: y */
    private void m51635y(ByteArrayOutputStream byteArrayOutputStream, C7949t0 t0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("hasPendingWrites", Boolean.valueOf(t0Var.mo26456a()));
        hashMap.put("isFromCache", Boolean.valueOf(t0Var.mo26457b()));
        mo22177p(byteArrayOutputStream, hashMap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Object mo22176g(byte b, ByteBuffer byteBuffer) {
        switch (b) {
            case Byte.MIN_VALUE:
                return new Date(byteBuffer.getLong());
            case -127:
                C6568r.m38100c(byteBuffer, 8);
                return new C7900c0(byteBuffer.getDouble(), byteBuffer.getDouble());
            case -126:
                return ((FirebaseFirestore) mo22175f(byteBuffer)).mo26302o((String) mo22175f(byteBuffer));
            case -125:
                return C7903e.m43701c(C6568r.m38101d(byteBuffer));
            case -124:
                return C7934q.m43837b(m51630t(mo22175f(byteBuffer)));
            case -123:
                return C7934q.m43836a(m51630t(mo22175f(byteBuffer)));
            case -122:
                return C7934q.m43838c();
            case -121:
                return C7934q.m43841g();
            case -120:
                return new C10428q(byteBuffer.getLong(), byteBuffer.getInt());
            case -119:
                return C7934q.m43839e(((Number) mo22175f(byteBuffer)).doubleValue());
            case -118:
                return C7934q.m43840f((long) ((Number) mo22175f(byteBuffer)).intValue());
            case -117:
                return C7932p.m43829a();
            case -116:
                int e = C6568r.m38102e(byteBuffer);
                ArrayList arrayList = new ArrayList(e);
                for (int i = 0; i < e; i++) {
                    arrayList.add(mo22175f(byteBuffer));
                }
                return C7932p.m43831d((String[]) arrayList.toArray(new String[0]));
            case -115:
                return Double.valueOf(Double.NaN);
            case -114:
                return Double.valueOf(Double.POSITIVE_INFINITY);
            case -113:
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            case -112:
                return m51627q(byteBuffer);
            case -111:
                return m51628r(byteBuffer);
            case -110:
                return m51629s(byteBuffer);
            default:
                return super.mo22176g(b, byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo22177p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof Date) {
            byteArrayOutputStream.write(-128);
            C6568r.m38109n(byteArrayOutputStream, ((Date) obj).getTime());
        } else if (obj instanceof C10428q) {
            byteArrayOutputStream.write(-120);
            C10428q qVar = (C10428q) obj;
            C6568r.m38109n(byteArrayOutputStream, qVar.mo33499c());
            C6568r.m38108m(byteArrayOutputStream, qVar.mo33498b());
        } else if (obj instanceof C7900c0) {
            byteArrayOutputStream.write(-127);
            C6568r.m38103h(byteArrayOutputStream, 8);
            C7900c0 c0Var = (C7900c0) obj;
            C6568r.m38106k(byteArrayOutputStream, c0Var.mo26326b());
            C6568r.m38106k(byteArrayOutputStream, c0Var.mo26327c());
        } else if (obj instanceof C7921l) {
            byteArrayOutputStream.write(-126);
            C7921l lVar = (C7921l) obj;
            mo22177p(byteArrayOutputStream, lVar.mo26389k().mo26304r().mo33470q());
            mo22177p(byteArrayOutputStream, lVar.mo26391m());
        } else if (obj instanceof C7923m) {
            m51632v(byteArrayOutputStream, (C7923m) obj);
        } else if (obj instanceof C7940q0) {
            m51634x(byteArrayOutputStream, (C7940q0) obj);
        } else if (obj instanceof C7907g) {
            m51631u(byteArrayOutputStream, (C7907g) obj);
        } else if (obj instanceof C7913h0) {
            m51633w(byteArrayOutputStream, (C7913h0) obj);
        } else if (obj instanceof C7949t0) {
            m51635y(byteArrayOutputStream, (C7949t0) obj);
        } else if (obj instanceof C7903e) {
            byteArrayOutputStream.write(-125);
            C6568r.m38104i(byteArrayOutputStream, ((C7903e) obj).mo26337k());
        } else if (obj instanceof Double) {
            Double d = (Double) obj;
            if (Double.isNaN(d.doubleValue())) {
                byteArrayOutputStream.write(-115);
            } else if (d.equals(Double.valueOf(Double.NEGATIVE_INFINITY))) {
                byteArrayOutputStream.write(-113);
            } else if (d.equals(Double.valueOf(Double.POSITIVE_INFINITY))) {
                byteArrayOutputStream.write(-114);
            } else {
                super.mo22177p(byteArrayOutputStream, obj);
            }
        } else {
            super.mo22177p(byteArrayOutputStream, obj);
        }
    }
}
