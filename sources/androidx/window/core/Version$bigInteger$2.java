package androidx.window.core;

import java.math.BigInteger;
import kotlin.jvm.internal.C11670l;
import p344rd.C12428a;

/* compiled from: Version.kt */
final class Version$bigInteger$2 extends C11670l implements C12428a<BigInteger> {
    final /* synthetic */ Version this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Version$bigInteger$2(Version version) {
        super(0);
        this.this$0 = version;
    }

    public final BigInteger invoke() {
        return BigInteger.valueOf((long) this.this$0.getMajor()).shiftLeft(32).or(BigInteger.valueOf((long) this.this$0.getMinor())).shiftLeft(32).or(BigInteger.valueOf((long) this.this$0.getPatch()));
    }
}
