package p091m1;

import android.util.SparseArray;
import com.google.auto.value.AutoValue;
import p091m1.C4985i;

@AutoValue
/* renamed from: m1.o */
/* compiled from: NetworkConnectionInfo */
public abstract class C4997o {

    @AutoValue.Builder
    /* renamed from: m1.o$a */
    /* compiled from: NetworkConnectionInfo */
    public static abstract class C4998a {
        /* renamed from: a */
        public abstract C4997o mo18922a();

        /* renamed from: b */
        public abstract C4998a mo18923b(C4999b bVar);

        /* renamed from: c */
        public abstract C4998a mo18924c(C5000c cVar);
    }

    /* renamed from: m1.o$b */
    /* compiled from: NetworkConnectionInfo */
    public enum C4999b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: E */
        private static final SparseArray<C4999b> f26149E = null;

        /* renamed from: a */
        private final int f26168a;

        static {
            C4999b bVar;
            C4999b bVar2;
            C4999b bVar3;
            C4999b bVar4;
            C4999b bVar5;
            C4999b bVar6;
            C4999b bVar7;
            C4999b bVar8;
            C4999b bVar9;
            C4999b bVar10;
            C4999b bVar11;
            C4999b bVar12;
            C4999b bVar13;
            C4999b bVar14;
            C4999b bVar15;
            C4999b bVar16;
            C4999b bVar17;
            C4999b bVar18;
            C4999b bVar19;
            C4999b bVar20;
            SparseArray<C4999b> sparseArray = new SparseArray<>();
            f26149E = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(1, bVar2);
            sparseArray.put(2, bVar3);
            sparseArray.put(3, bVar4);
            sparseArray.put(4, bVar5);
            sparseArray.put(5, bVar6);
            sparseArray.put(6, bVar7);
            sparseArray.put(7, bVar8);
            sparseArray.put(8, bVar9);
            sparseArray.put(9, bVar10);
            sparseArray.put(10, bVar11);
            sparseArray.put(11, bVar12);
            sparseArray.put(12, bVar20);
            sparseArray.put(13, bVar13);
            sparseArray.put(14, bVar14);
            sparseArray.put(15, bVar15);
            sparseArray.put(16, bVar16);
            sparseArray.put(17, bVar17);
            sparseArray.put(18, bVar18);
            sparseArray.put(19, bVar19);
        }

        private C4999b(int i) {
            this.f26168a = i;
        }

        /* renamed from: a */
        public static C4999b m31549a(int i) {
            return f26149E.get(i);
        }

        /* renamed from: b */
        public int mo18927b() {
            return this.f26168a;
        }
    }

    /* renamed from: m1.o$c */
    /* compiled from: NetworkConnectionInfo */
    public enum C5000c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        

        /* renamed from: C */
        private static final SparseArray<C5000c> f26171C = null;

        /* renamed from: a */
        private final int f26190a;

        static {
            C5000c cVar;
            C5000c cVar2;
            C5000c cVar3;
            C5000c cVar4;
            C5000c cVar5;
            C5000c cVar6;
            C5000c cVar7;
            C5000c cVar8;
            C5000c cVar9;
            C5000c cVar10;
            C5000c cVar11;
            C5000c cVar12;
            C5000c cVar13;
            C5000c cVar14;
            C5000c cVar15;
            C5000c cVar16;
            C5000c cVar17;
            C5000c cVar18;
            C5000c cVar19;
            SparseArray<C5000c> sparseArray = new SparseArray<>();
            f26171C = sparseArray;
            sparseArray.put(0, cVar);
            sparseArray.put(1, cVar2);
            sparseArray.put(2, cVar3);
            sparseArray.put(3, cVar4);
            sparseArray.put(4, cVar5);
            sparseArray.put(5, cVar6);
            sparseArray.put(6, cVar7);
            sparseArray.put(7, cVar8);
            sparseArray.put(8, cVar9);
            sparseArray.put(9, cVar10);
            sparseArray.put(10, cVar11);
            sparseArray.put(11, cVar12);
            sparseArray.put(12, cVar19);
            sparseArray.put(13, cVar13);
            sparseArray.put(14, cVar14);
            sparseArray.put(15, cVar15);
            sparseArray.put(16, cVar16);
            sparseArray.put(17, cVar18);
            sparseArray.put(-1, cVar17);
        }

        private C5000c(int i) {
            this.f26190a = i;
        }

        /* renamed from: a */
        public static C5000c m31551a(int i) {
            return f26171C.get(i);
        }

        /* renamed from: b */
        public int mo18928b() {
            return this.f26190a;
        }
    }

    /* renamed from: a */
    public static C4998a m31543a() {
        return new C4985i.C4987b();
    }

    /* renamed from: b */
    public abstract C4999b mo18917b();

    /* renamed from: c */
    public abstract C5000c mo18918c();
}
