package edu.aku.hassannaqvi.mapps;

/**
 * Created by isd on 24/10/2016.
 */

public class CVars {
    public static String myuser;
    public static String hhno;
    public static String var_age_yy;
    public static String var_age_mm;
    public static String var_lmp_mm;
    public static String var_q15_fid;
    public static String var_q15_mid;
    public static String var_q28a_femalename;
    public static String var_s3q16_1;

    public static String var_q28b_femaleid;
    public static String url_sync_users;
    public static String url_sync_hf;
    public static String url_sync_lhw;
    public static String url_sync_usr;
    public static String url_sync_sec1;

    public static String ismale;
    public static String issingle;
    public static String cluster;
    public static long myid;

    public static String cluster1;
    public static String lhw;
    public static String hh;

    public static String userstatus;
    public static String isadmin;


    public String get_isadmin() {
        return isadmin;
    }

    public void set_isadmin(String isadmin) {
        CVars.isadmin = isadmin;
    }

    public String get_userstatus() {
        return userstatus;
    }

    public void set_userstatus(String userstatus) {
        CVars.userstatus = userstatus;
    }


    public String get_s3q16_1() {
        return var_s3q16_1;
    }

    public void set_s3q16_1(String var_s3q16_1) {
        CVars.var_s3q16_1 = var_s3q16_1;
    }


    public String get_url_sync_sec1() {
        return url_sync_sec1;
    }

    public void set_url_sync_sec1(String url_sync_sec1) {
        CVars.url_sync_sec1 = url_sync_sec1;
    }


    public void Store_ismale(String ismale) {
        CVars.ismale = ismale;
    }

    public String Get_ismale() {
        return ismale;
    }

    public void Store_issingle(String issingle) {
        CVars.issingle = issingle;
    }

    public String Get_isingle() {
        return issingle;
    }

    public void StoreUser(String Users) {
        myuser = Users;
    }

    public void Storehhno(String hhno) {
        CVars.hhno = hhno;
    }

    public void StoreQ15fid(String var_q15_fid) {
        CVars.var_q15_fid = var_q15_fid;
    }

    public void StoreQ15mid(String var_q15_mid) {
        CVars.var_q15_mid = var_q15_mid;
    }

    public void StoreAgeYY(String var_age_yy) {
        CVars.var_age_yy = var_age_yy;
    }

    public void StoreAgeMM(String var_age_mm) {
        CVars.var_age_mm = var_age_mm;
    }

    public void StoreQ28b_FemaleID(String femaleid) {
        var_q28b_femaleid = femaleid;
    }

    public void StoreQ28b_FemaleName(String femalename) {
        var_q28a_femalename = femalename;
    }

    public String GetUser() {
        return myuser;
    }

    public String Getfid() {
        return var_q15_fid;
    }

    public String Getmid() {
        return var_q15_mid;
    }

    public String Gethhno() {
        return hhno;
    }

    public String GetAgeYY() {
        return var_age_yy;
    }

    public String GetAgeMM() {
        return var_age_mm;
    }

    public String Get_S2q28b_FemaleID() {
        return var_q28b_femaleid;
    }

    public String Get_S2q28a_FemaleName() {
        return var_q28a_femalename;
    }

    public String getUrl_sync_usr() {
        return url_sync_usr;
    }

    public void setUrl_sync_usr(String url_sync_usr) {
        CVars.url_sync_usr = url_sync_usr;
    }

    public String getUrl_sync_hf() {
        return url_sync_hf;
    }

    public void setUrl_sync_hf(String url_sync_hf) {
        CVars.url_sync_hf = url_sync_hf;
    }

    public String getUrl_sync_lhw() {
        return url_sync_lhw;
    }

    public void setUrl_sync_lhw(String url_sync_lhw) {
        CVars.url_sync_lhw = url_sync_lhw;
    }

    public String getUrl_sync_users() {
        return url_sync_users;
    }

    public void setUrl_sync_users(String url_sync_users) {
        CVars.url_sync_users = url_sync_users;
    }

    public String getClusterName() {
        return cluster;
    }

    public void setClusterName(String cluster) {
        CVars.cluster = cluster;
    }


    public String getLMP_Months() {
        return var_lmp_mm;
    }

    public void setLMP_Months(String var_lmp_mm) {
        CVars.var_lmp_mm = var_lmp_mm;
    }

    public long get_myid() {
        return myid;
    }

    public void set_myid(long myid) {
        CVars.myid = myid;
    }


    public String get_mycluster() {
        return cluster;
    }

    public void set_mycluster(String cluster) {
        CVars.cluster = cluster;
    }

    public String get_mylhw() {
        return lhw;
    }

    public void set_mylhw(String lhw) {
        CVars.lhw = lhw;
    }

    public String get_myhh() {
        return hh;
    }

    public void set_myhh(String hh) {
        CVars.hh = hh;
    }
}