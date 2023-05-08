package com.fkp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KmsServerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KmsServerExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andServerIsNull() {
            addCriterion("server is null");
            return (Criteria) this;
        }

        public Criteria andServerIsNotNull() {
            addCriterion("server is not null");
            return (Criteria) this;
        }

        public Criteria andServerEqualTo(String value) {
            addCriterion("server =", value, "server");
            return (Criteria) this;
        }

        public Criteria andServerNotEqualTo(String value) {
            addCriterion("server <>", value, "server");
            return (Criteria) this;
        }

        public Criteria andServerGreaterThan(String value) {
            addCriterion("server >", value, "server");
            return (Criteria) this;
        }

        public Criteria andServerGreaterThanOrEqualTo(String value) {
            addCriterion("server >=", value, "server");
            return (Criteria) this;
        }

        public Criteria andServerLessThan(String value) {
            addCriterion("server <", value, "server");
            return (Criteria) this;
        }

        public Criteria andServerLessThanOrEqualTo(String value) {
            addCriterion("server <=", value, "server");
            return (Criteria) this;
        }

        public Criteria andServerLike(String value) {
            addCriterion("server like", value, "server");
            return (Criteria) this;
        }

        public Criteria andServerNotLike(String value) {
            addCriterion("server not like", value, "server");
            return (Criteria) this;
        }

        public Criteria andServerIn(List<String> values) {
            addCriterion("server in", values, "server");
            return (Criteria) this;
        }

        public Criteria andServerNotIn(List<String> values) {
            addCriterion("server not in", values, "server");
            return (Criteria) this;
        }

        public Criteria andServerBetween(String value1, String value2) {
            addCriterion("server between", value1, value2, "server");
            return (Criteria) this;
        }

        public Criteria andServerNotBetween(String value1, String value2) {
            addCriterion("server not between", value1, value2, "server");
            return (Criteria) this;
        }

        public Criteria andServerStatusIsNull() {
            addCriterion("server_status is null");
            return (Criteria) this;
        }

        public Criteria andServerStatusIsNotNull() {
            addCriterion("server_status is not null");
            return (Criteria) this;
        }

        public Criteria andServerStatusEqualTo(String value) {
            addCriterion("server_status =", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusNotEqualTo(String value) {
            addCriterion("server_status <>", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusGreaterThan(String value) {
            addCriterion("server_status >", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusGreaterThanOrEqualTo(String value) {
            addCriterion("server_status >=", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusLessThan(String value) {
            addCriterion("server_status <", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusLessThanOrEqualTo(String value) {
            addCriterion("server_status <=", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusLike(String value) {
            addCriterion("server_status like", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusNotLike(String value) {
            addCriterion("server_status not like", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusIn(List<String> values) {
            addCriterion("server_status in", values, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusNotIn(List<String> values) {
            addCriterion("server_status not in", values, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusBetween(String value1, String value2) {
            addCriterion("server_status between", value1, value2, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusNotBetween(String value1, String value2) {
            addCriterion("server_status not between", value1, value2, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andIpAuthorizationIsNull() {
            addCriterion("ip_authorization is null");
            return (Criteria) this;
        }

        public Criteria andIpAuthorizationIsNotNull() {
            addCriterion("ip_authorization is not null");
            return (Criteria) this;
        }

        public Criteria andIpAuthorizationEqualTo(Integer value) {
            addCriterion("ip_authorization =", value, "ipAuthorization");
            return (Criteria) this;
        }

        public Criteria andIpAuthorizationNotEqualTo(Integer value) {
            addCriterion("ip_authorization <>", value, "ipAuthorization");
            return (Criteria) this;
        }

        public Criteria andIpAuthorizationGreaterThan(Integer value) {
            addCriterion("ip_authorization >", value, "ipAuthorization");
            return (Criteria) this;
        }

        public Criteria andIpAuthorizationGreaterThanOrEqualTo(Integer value) {
            addCriterion("ip_authorization >=", value, "ipAuthorization");
            return (Criteria) this;
        }

        public Criteria andIpAuthorizationLessThan(Integer value) {
            addCriterion("ip_authorization <", value, "ipAuthorization");
            return (Criteria) this;
        }

        public Criteria andIpAuthorizationLessThanOrEqualTo(Integer value) {
            addCriterion("ip_authorization <=", value, "ipAuthorization");
            return (Criteria) this;
        }

        public Criteria andIpAuthorizationIn(List<Integer> values) {
            addCriterion("ip_authorization in", values, "ipAuthorization");
            return (Criteria) this;
        }

        public Criteria andIpAuthorizationNotIn(List<Integer> values) {
            addCriterion("ip_authorization not in", values, "ipAuthorization");
            return (Criteria) this;
        }

        public Criteria andIpAuthorizationBetween(Integer value1, Integer value2) {
            addCriterion("ip_authorization between", value1, value2, "ipAuthorization");
            return (Criteria) this;
        }

        public Criteria andIpAuthorizationNotBetween(Integer value1, Integer value2) {
            addCriterion("ip_authorization not between", value1, value2, "ipAuthorization");
            return (Criteria) this;
        }

        public Criteria andIsKeyserverIsNull() {
            addCriterion("is_keyserver is null");
            return (Criteria) this;
        }

        public Criteria andIsKeyserverIsNotNull() {
            addCriterion("is_keyserver is not null");
            return (Criteria) this;
        }

        public Criteria andIsKeyserverEqualTo(Integer value) {
            addCriterion("is_keyserver =", value, "isKeyserver");
            return (Criteria) this;
        }

        public Criteria andIsKeyserverNotEqualTo(Integer value) {
            addCriterion("is_keyserver <>", value, "isKeyserver");
            return (Criteria) this;
        }

        public Criteria andIsKeyserverGreaterThan(Integer value) {
            addCriterion("is_keyserver >", value, "isKeyserver");
            return (Criteria) this;
        }

        public Criteria andIsKeyserverGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_keyserver >=", value, "isKeyserver");
            return (Criteria) this;
        }

        public Criteria andIsKeyserverLessThan(Integer value) {
            addCriterion("is_keyserver <", value, "isKeyserver");
            return (Criteria) this;
        }

        public Criteria andIsKeyserverLessThanOrEqualTo(Integer value) {
            addCriterion("is_keyserver <=", value, "isKeyserver");
            return (Criteria) this;
        }

        public Criteria andIsKeyserverIn(List<Integer> values) {
            addCriterion("is_keyserver in", values, "isKeyserver");
            return (Criteria) this;
        }

        public Criteria andIsKeyserverNotIn(List<Integer> values) {
            addCriterion("is_keyserver not in", values, "isKeyserver");
            return (Criteria) this;
        }

        public Criteria andIsKeyserverBetween(Integer value1, Integer value2) {
            addCriterion("is_keyserver between", value1, value2, "isKeyserver");
            return (Criteria) this;
        }

        public Criteria andIsKeyserverNotBetween(Integer value1, Integer value2) {
            addCriterion("is_keyserver not between", value1, value2, "isKeyserver");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(String value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(String value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(String value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(String value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(String value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(String value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLike(String value) {
            addCriterion("port like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotLike(String value) {
            addCriterion("port not like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<String> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<String> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(String value1, String value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(String value1, String value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPwdAuthIsNull() {
            addCriterion("pwd_auth is null");
            return (Criteria) this;
        }

        public Criteria andPwdAuthIsNotNull() {
            addCriterion("pwd_auth is not null");
            return (Criteria) this;
        }

        public Criteria andPwdAuthEqualTo(String value) {
            addCriterion("pwd_auth =", value, "pwdAuth");
            return (Criteria) this;
        }

        public Criteria andPwdAuthNotEqualTo(String value) {
            addCriterion("pwd_auth <>", value, "pwdAuth");
            return (Criteria) this;
        }

        public Criteria andPwdAuthGreaterThan(String value) {
            addCriterion("pwd_auth >", value, "pwdAuth");
            return (Criteria) this;
        }

        public Criteria andPwdAuthGreaterThanOrEqualTo(String value) {
            addCriterion("pwd_auth >=", value, "pwdAuth");
            return (Criteria) this;
        }

        public Criteria andPwdAuthLessThan(String value) {
            addCriterion("pwd_auth <", value, "pwdAuth");
            return (Criteria) this;
        }

        public Criteria andPwdAuthLessThanOrEqualTo(String value) {
            addCriterion("pwd_auth <=", value, "pwdAuth");
            return (Criteria) this;
        }

        public Criteria andPwdAuthLike(String value) {
            addCriterion("pwd_auth like", value, "pwdAuth");
            return (Criteria) this;
        }

        public Criteria andPwdAuthNotLike(String value) {
            addCriterion("pwd_auth not like", value, "pwdAuth");
            return (Criteria) this;
        }

        public Criteria andPwdAuthIn(List<String> values) {
            addCriterion("pwd_auth in", values, "pwdAuth");
            return (Criteria) this;
        }

        public Criteria andPwdAuthNotIn(List<String> values) {
            addCriterion("pwd_auth not in", values, "pwdAuth");
            return (Criteria) this;
        }

        public Criteria andPwdAuthBetween(String value1, String value2) {
            addCriterion("pwd_auth between", value1, value2, "pwdAuth");
            return (Criteria) this;
        }

        public Criteria andPwdAuthNotBetween(String value1, String value2) {
            addCriterion("pwd_auth not between", value1, value2, "pwdAuth");
            return (Criteria) this;
        }

        public Criteria andClientcertAuthIsNull() {
            addCriterion("clientcert_auth is null");
            return (Criteria) this;
        }

        public Criteria andClientcertAuthIsNotNull() {
            addCriterion("clientcert_auth is not null");
            return (Criteria) this;
        }

        public Criteria andClientcertAuthEqualTo(String value) {
            addCriterion("clientcert_auth =", value, "clientcertAuth");
            return (Criteria) this;
        }

        public Criteria andClientcertAuthNotEqualTo(String value) {
            addCriterion("clientcert_auth <>", value, "clientcertAuth");
            return (Criteria) this;
        }

        public Criteria andClientcertAuthGreaterThan(String value) {
            addCriterion("clientcert_auth >", value, "clientcertAuth");
            return (Criteria) this;
        }

        public Criteria andClientcertAuthGreaterThanOrEqualTo(String value) {
            addCriterion("clientcert_auth >=", value, "clientcertAuth");
            return (Criteria) this;
        }

        public Criteria andClientcertAuthLessThan(String value) {
            addCriterion("clientcert_auth <", value, "clientcertAuth");
            return (Criteria) this;
        }

        public Criteria andClientcertAuthLessThanOrEqualTo(String value) {
            addCriterion("clientcert_auth <=", value, "clientcertAuth");
            return (Criteria) this;
        }

        public Criteria andClientcertAuthLike(String value) {
            addCriterion("clientcert_auth like", value, "clientcertAuth");
            return (Criteria) this;
        }

        public Criteria andClientcertAuthNotLike(String value) {
            addCriterion("clientcert_auth not like", value, "clientcertAuth");
            return (Criteria) this;
        }

        public Criteria andClientcertAuthIn(List<String> values) {
            addCriterion("clientcert_auth in", values, "clientcertAuth");
            return (Criteria) this;
        }

        public Criteria andClientcertAuthNotIn(List<String> values) {
            addCriterion("clientcert_auth not in", values, "clientcertAuth");
            return (Criteria) this;
        }

        public Criteria andClientcertAuthBetween(String value1, String value2) {
            addCriterion("clientcert_auth between", value1, value2, "clientcertAuth");
            return (Criteria) this;
        }

        public Criteria andClientcertAuthNotBetween(String value1, String value2) {
            addCriterion("clientcert_auth not between", value1, value2, "clientcertAuth");
            return (Criteria) this;
        }

        public Criteria andTrustedCaIdIsNull() {
            addCriterion("trusted_ca_id is null");
            return (Criteria) this;
        }

        public Criteria andTrustedCaIdIsNotNull() {
            addCriterion("trusted_ca_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrustedCaIdEqualTo(String value) {
            addCriterion("trusted_ca_id =", value, "trustedCaId");
            return (Criteria) this;
        }

        public Criteria andTrustedCaIdNotEqualTo(String value) {
            addCriterion("trusted_ca_id <>", value, "trustedCaId");
            return (Criteria) this;
        }

        public Criteria andTrustedCaIdGreaterThan(String value) {
            addCriterion("trusted_ca_id >", value, "trustedCaId");
            return (Criteria) this;
        }

        public Criteria andTrustedCaIdGreaterThanOrEqualTo(String value) {
            addCriterion("trusted_ca_id >=", value, "trustedCaId");
            return (Criteria) this;
        }

        public Criteria andTrustedCaIdLessThan(String value) {
            addCriterion("trusted_ca_id <", value, "trustedCaId");
            return (Criteria) this;
        }

        public Criteria andTrustedCaIdLessThanOrEqualTo(String value) {
            addCriterion("trusted_ca_id <=", value, "trustedCaId");
            return (Criteria) this;
        }

        public Criteria andTrustedCaIdLike(String value) {
            addCriterion("trusted_ca_id like", value, "trustedCaId");
            return (Criteria) this;
        }

        public Criteria andTrustedCaIdNotLike(String value) {
            addCriterion("trusted_ca_id not like", value, "trustedCaId");
            return (Criteria) this;
        }

        public Criteria andTrustedCaIdIn(List<String> values) {
            addCriterion("trusted_ca_id in", values, "trustedCaId");
            return (Criteria) this;
        }

        public Criteria andTrustedCaIdNotIn(List<String> values) {
            addCriterion("trusted_ca_id not in", values, "trustedCaId");
            return (Criteria) this;
        }

        public Criteria andTrustedCaIdBetween(String value1, String value2) {
            addCriterion("trusted_ca_id between", value1, value2, "trustedCaId");
            return (Criteria) this;
        }

        public Criteria andTrustedCaIdNotBetween(String value1, String value2) {
            addCriterion("trusted_ca_id not between", value1, value2, "trustedCaId");
            return (Criteria) this;
        }

        public Criteria andServerCertificateIdIsNull() {
            addCriterion("server_certificate_id is null");
            return (Criteria) this;
        }

        public Criteria andServerCertificateIdIsNotNull() {
            addCriterion("server_certificate_id is not null");
            return (Criteria) this;
        }

        public Criteria andServerCertificateIdEqualTo(String value) {
            addCriterion("server_certificate_id =", value, "serverCertificateId");
            return (Criteria) this;
        }

        public Criteria andServerCertificateIdNotEqualTo(String value) {
            addCriterion("server_certificate_id <>", value, "serverCertificateId");
            return (Criteria) this;
        }

        public Criteria andServerCertificateIdGreaterThan(String value) {
            addCriterion("server_certificate_id >", value, "serverCertificateId");
            return (Criteria) this;
        }

        public Criteria andServerCertificateIdGreaterThanOrEqualTo(String value) {
            addCriterion("server_certificate_id >=", value, "serverCertificateId");
            return (Criteria) this;
        }

        public Criteria andServerCertificateIdLessThan(String value) {
            addCriterion("server_certificate_id <", value, "serverCertificateId");
            return (Criteria) this;
        }

        public Criteria andServerCertificateIdLessThanOrEqualTo(String value) {
            addCriterion("server_certificate_id <=", value, "serverCertificateId");
            return (Criteria) this;
        }

        public Criteria andServerCertificateIdLike(String value) {
            addCriterion("server_certificate_id like", value, "serverCertificateId");
            return (Criteria) this;
        }

        public Criteria andServerCertificateIdNotLike(String value) {
            addCriterion("server_certificate_id not like", value, "serverCertificateId");
            return (Criteria) this;
        }

        public Criteria andServerCertificateIdIn(List<String> values) {
            addCriterion("server_certificate_id in", values, "serverCertificateId");
            return (Criteria) this;
        }

        public Criteria andServerCertificateIdNotIn(List<String> values) {
            addCriterion("server_certificate_id not in", values, "serverCertificateId");
            return (Criteria) this;
        }

        public Criteria andServerCertificateIdBetween(String value1, String value2) {
            addCriterion("server_certificate_id between", value1, value2, "serverCertificateId");
            return (Criteria) this;
        }

        public Criteria andServerCertificateIdNotBetween(String value1, String value2) {
            addCriterion("server_certificate_id not between", value1, value2, "serverCertificateId");
            return (Criteria) this;
        }

        public Criteria andUseSslIsNull() {
            addCriterion("use_ssl is null");
            return (Criteria) this;
        }

        public Criteria andUseSslIsNotNull() {
            addCriterion("use_ssl is not null");
            return (Criteria) this;
        }

        public Criteria andUseSslEqualTo(String value) {
            addCriterion("use_ssl =", value, "useSsl");
            return (Criteria) this;
        }

        public Criteria andUseSslNotEqualTo(String value) {
            addCriterion("use_ssl <>", value, "useSsl");
            return (Criteria) this;
        }

        public Criteria andUseSslGreaterThan(String value) {
            addCriterion("use_ssl >", value, "useSsl");
            return (Criteria) this;
        }

        public Criteria andUseSslGreaterThanOrEqualTo(String value) {
            addCriterion("use_ssl >=", value, "useSsl");
            return (Criteria) this;
        }

        public Criteria andUseSslLessThan(String value) {
            addCriterion("use_ssl <", value, "useSsl");
            return (Criteria) this;
        }

        public Criteria andUseSslLessThanOrEqualTo(String value) {
            addCriterion("use_ssl <=", value, "useSsl");
            return (Criteria) this;
        }

        public Criteria andUseSslLike(String value) {
            addCriterion("use_ssl like", value, "useSsl");
            return (Criteria) this;
        }

        public Criteria andUseSslNotLike(String value) {
            addCriterion("use_ssl not like", value, "useSsl");
            return (Criteria) this;
        }

        public Criteria andUseSslIn(List<String> values) {
            addCriterion("use_ssl in", values, "useSsl");
            return (Criteria) this;
        }

        public Criteria andUseSslNotIn(List<String> values) {
            addCriterion("use_ssl not in", values, "useSsl");
            return (Criteria) this;
        }

        public Criteria andUseSslBetween(String value1, String value2) {
            addCriterion("use_ssl between", value1, value2, "useSsl");
            return (Criteria) this;
        }

        public Criteria andUseSslNotBetween(String value1, String value2) {
            addCriterion("use_ssl not between", value1, value2, "useSsl");
            return (Criteria) this;
        }

        public Criteria andWhiteListIsNull() {
            addCriterion("white_list is null");
            return (Criteria) this;
        }

        public Criteria andWhiteListIsNotNull() {
            addCriterion("white_list is not null");
            return (Criteria) this;
        }

        public Criteria andWhiteListEqualTo(String value) {
            addCriterion("white_list =", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListNotEqualTo(String value) {
            addCriterion("white_list <>", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListGreaterThan(String value) {
            addCriterion("white_list >", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListGreaterThanOrEqualTo(String value) {
            addCriterion("white_list >=", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListLessThan(String value) {
            addCriterion("white_list <", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListLessThanOrEqualTo(String value) {
            addCriterion("white_list <=", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListLike(String value) {
            addCriterion("white_list like", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListNotLike(String value) {
            addCriterion("white_list not like", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListIn(List<String> values) {
            addCriterion("white_list in", values, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListNotIn(List<String> values) {
            addCriterion("white_list not in", values, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListBetween(String value1, String value2) {
            addCriterion("white_list between", value1, value2, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListNotBetween(String value1, String value2) {
            addCriterion("white_list not between", value1, value2, "whiteList");
            return (Criteria) this;
        }

        public Criteria andServerUsernameIsNull() {
            addCriterion("server_username is null");
            return (Criteria) this;
        }

        public Criteria andServerUsernameIsNotNull() {
            addCriterion("server_username is not null");
            return (Criteria) this;
        }

        public Criteria andServerUsernameEqualTo(String value) {
            addCriterion("server_username =", value, "serverUsername");
            return (Criteria) this;
        }

        public Criteria andServerUsernameNotEqualTo(String value) {
            addCriterion("server_username <>", value, "serverUsername");
            return (Criteria) this;
        }

        public Criteria andServerUsernameGreaterThan(String value) {
            addCriterion("server_username >", value, "serverUsername");
            return (Criteria) this;
        }

        public Criteria andServerUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("server_username >=", value, "serverUsername");
            return (Criteria) this;
        }

        public Criteria andServerUsernameLessThan(String value) {
            addCriterion("server_username <", value, "serverUsername");
            return (Criteria) this;
        }

        public Criteria andServerUsernameLessThanOrEqualTo(String value) {
            addCriterion("server_username <=", value, "serverUsername");
            return (Criteria) this;
        }

        public Criteria andServerUsernameLike(String value) {
            addCriterion("server_username like", value, "serverUsername");
            return (Criteria) this;
        }

        public Criteria andServerUsernameNotLike(String value) {
            addCriterion("server_username not like", value, "serverUsername");
            return (Criteria) this;
        }

        public Criteria andServerUsernameIn(List<String> values) {
            addCriterion("server_username in", values, "serverUsername");
            return (Criteria) this;
        }

        public Criteria andServerUsernameNotIn(List<String> values) {
            addCriterion("server_username not in", values, "serverUsername");
            return (Criteria) this;
        }

        public Criteria andServerUsernameBetween(String value1, String value2) {
            addCriterion("server_username between", value1, value2, "serverUsername");
            return (Criteria) this;
        }

        public Criteria andServerUsernameNotBetween(String value1, String value2) {
            addCriterion("server_username not between", value1, value2, "serverUsername");
            return (Criteria) this;
        }

        public Criteria andServerUserpwdIsNull() {
            addCriterion("server_userpwd is null");
            return (Criteria) this;
        }

        public Criteria andServerUserpwdIsNotNull() {
            addCriterion("server_userpwd is not null");
            return (Criteria) this;
        }

        public Criteria andServerUserpwdEqualTo(String value) {
            addCriterion("server_userpwd =", value, "serverUserpwd");
            return (Criteria) this;
        }

        public Criteria andServerUserpwdNotEqualTo(String value) {
            addCriterion("server_userpwd <>", value, "serverUserpwd");
            return (Criteria) this;
        }

        public Criteria andServerUserpwdGreaterThan(String value) {
            addCriterion("server_userpwd >", value, "serverUserpwd");
            return (Criteria) this;
        }

        public Criteria andServerUserpwdGreaterThanOrEqualTo(String value) {
            addCriterion("server_userpwd >=", value, "serverUserpwd");
            return (Criteria) this;
        }

        public Criteria andServerUserpwdLessThan(String value) {
            addCriterion("server_userpwd <", value, "serverUserpwd");
            return (Criteria) this;
        }

        public Criteria andServerUserpwdLessThanOrEqualTo(String value) {
            addCriterion("server_userpwd <=", value, "serverUserpwd");
            return (Criteria) this;
        }

        public Criteria andServerUserpwdLike(String value) {
            addCriterion("server_userpwd like", value, "serverUserpwd");
            return (Criteria) this;
        }

        public Criteria andServerUserpwdNotLike(String value) {
            addCriterion("server_userpwd not like", value, "serverUserpwd");
            return (Criteria) this;
        }

        public Criteria andServerUserpwdIn(List<String> values) {
            addCriterion("server_userpwd in", values, "serverUserpwd");
            return (Criteria) this;
        }

        public Criteria andServerUserpwdNotIn(List<String> values) {
            addCriterion("server_userpwd not in", values, "serverUserpwd");
            return (Criteria) this;
        }

        public Criteria andServerUserpwdBetween(String value1, String value2) {
            addCriterion("server_userpwd between", value1, value2, "serverUserpwd");
            return (Criteria) this;
        }

        public Criteria andServerUserpwdNotBetween(String value1, String value2) {
            addCriterion("server_userpwd not between", value1, value2, "serverUserpwd");
            return (Criteria) this;
        }

        public Criteria andWebappPathIsNull() {
            addCriterion("webapp_path is null");
            return (Criteria) this;
        }

        public Criteria andWebappPathIsNotNull() {
            addCriterion("webapp_path is not null");
            return (Criteria) this;
        }

        public Criteria andWebappPathEqualTo(String value) {
            addCriterion("webapp_path =", value, "webappPath");
            return (Criteria) this;
        }

        public Criteria andWebappPathNotEqualTo(String value) {
            addCriterion("webapp_path <>", value, "webappPath");
            return (Criteria) this;
        }

        public Criteria andWebappPathGreaterThan(String value) {
            addCriterion("webapp_path >", value, "webappPath");
            return (Criteria) this;
        }

        public Criteria andWebappPathGreaterThanOrEqualTo(String value) {
            addCriterion("webapp_path >=", value, "webappPath");
            return (Criteria) this;
        }

        public Criteria andWebappPathLessThan(String value) {
            addCriterion("webapp_path <", value, "webappPath");
            return (Criteria) this;
        }

        public Criteria andWebappPathLessThanOrEqualTo(String value) {
            addCriterion("webapp_path <=", value, "webappPath");
            return (Criteria) this;
        }

        public Criteria andWebappPathLike(String value) {
            addCriterion("webapp_path like", value, "webappPath");
            return (Criteria) this;
        }

        public Criteria andWebappPathNotLike(String value) {
            addCriterion("webapp_path not like", value, "webappPath");
            return (Criteria) this;
        }

        public Criteria andWebappPathIn(List<String> values) {
            addCriterion("webapp_path in", values, "webappPath");
            return (Criteria) this;
        }

        public Criteria andWebappPathNotIn(List<String> values) {
            addCriterion("webapp_path not in", values, "webappPath");
            return (Criteria) this;
        }

        public Criteria andWebappPathBetween(String value1, String value2) {
            addCriterion("webapp_path between", value1, value2, "webappPath");
            return (Criteria) this;
        }

        public Criteria andWebappPathNotBetween(String value1, String value2) {
            addCriterion("webapp_path not between", value1, value2, "webappPath");
            return (Criteria) this;
        }

        public Criteria andKmsuserIsNull() {
            addCriterion("kmsuser is null");
            return (Criteria) this;
        }

        public Criteria andKmsuserIsNotNull() {
            addCriterion("kmsuser is not null");
            return (Criteria) this;
        }

        public Criteria andKmsuserEqualTo(String value) {
            addCriterion("kmsuser =", value, "kmsuser");
            return (Criteria) this;
        }

        public Criteria andKmsuserNotEqualTo(String value) {
            addCriterion("kmsuser <>", value, "kmsuser");
            return (Criteria) this;
        }

        public Criteria andKmsuserGreaterThan(String value) {
            addCriterion("kmsuser >", value, "kmsuser");
            return (Criteria) this;
        }

        public Criteria andKmsuserGreaterThanOrEqualTo(String value) {
            addCriterion("kmsuser >=", value, "kmsuser");
            return (Criteria) this;
        }

        public Criteria andKmsuserLessThan(String value) {
            addCriterion("kmsuser <", value, "kmsuser");
            return (Criteria) this;
        }

        public Criteria andKmsuserLessThanOrEqualTo(String value) {
            addCriterion("kmsuser <=", value, "kmsuser");
            return (Criteria) this;
        }

        public Criteria andKmsuserLike(String value) {
            addCriterion("kmsuser like", value, "kmsuser");
            return (Criteria) this;
        }

        public Criteria andKmsuserNotLike(String value) {
            addCriterion("kmsuser not like", value, "kmsuser");
            return (Criteria) this;
        }

        public Criteria andKmsuserIn(List<String> values) {
            addCriterion("kmsuser in", values, "kmsuser");
            return (Criteria) this;
        }

        public Criteria andKmsuserNotIn(List<String> values) {
            addCriterion("kmsuser not in", values, "kmsuser");
            return (Criteria) this;
        }

        public Criteria andKmsuserBetween(String value1, String value2) {
            addCriterion("kmsuser between", value1, value2, "kmsuser");
            return (Criteria) this;
        }

        public Criteria andKmsuserNotBetween(String value1, String value2) {
            addCriterion("kmsuser not between", value1, value2, "kmsuser");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("createby is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("createby is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(String value) {
            addCriterion("createby =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(String value) {
            addCriterion("createby <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(String value) {
            addCriterion("createby >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("createby >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(String value) {
            addCriterion("createby <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(String value) {
            addCriterion("createby <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLike(String value) {
            addCriterion("createby like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotLike(String value) {
            addCriterion("createby not like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<String> values) {
            addCriterion("createby in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<String> values) {
            addCriterion("createby not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(String value1, String value2) {
            addCriterion("createby between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(String value1, String value2) {
            addCriterion("createby not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNull() {
            addCriterion("updateby is null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNotNull() {
            addCriterion("updateby is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyEqualTo(String value) {
            addCriterion("updateby =", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotEqualTo(String value) {
            addCriterion("updateby <>", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThan(String value) {
            addCriterion("updateby >", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThanOrEqualTo(String value) {
            addCriterion("updateby >=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThan(String value) {
            addCriterion("updateby <", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThanOrEqualTo(String value) {
            addCriterion("updateby <=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLike(String value) {
            addCriterion("updateby like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotLike(String value) {
            addCriterion("updateby not like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIn(List<String> values) {
            addCriterion("updateby in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotIn(List<String> values) {
            addCriterion("updateby not in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyBetween(String value1, String value2) {
            addCriterion("updateby between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotBetween(String value1, String value2) {
            addCriterion("updateby not between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("updatedate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("updatedate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("updatedate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("updatedate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("updatedate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("updatedate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("updatedate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("updatedate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("updatedate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("updatedate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("updatedate not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}