package com.java.mybatis.domain;

public class PublicMethod {
    private String methodId;

    private String methodName;

    private String methodTitle;

    private String methodContent;

    private String methodDescr;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_method.method_id
     *
     * @return the value of public_method.method_id
     *
     * @mbg.generated Sun Feb 11 18:24:59 CST 2018
     */
    public String getMethodId() {
        return methodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_method.method_id
     *
     * @param methodId the value for public_method.method_id
     *
     * @mbg.generated Sun Feb 11 18:24:59 CST 2018
     */
    public void setMethodId(String methodId) {
        this.methodId = methodId == null ? null : methodId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_method.method_name
     *
     * @return the value of public_method.method_name
     *
     * @mbg.generated Sun Feb 11 18:24:59 CST 2018
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_method.method_name
     *
     * @param methodName the value for public_method.method_name
     *
     * @mbg.generated Sun Feb 11 18:24:59 CST 2018
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_method.method_title
     *
     * @return the value of public_method.method_title
     *
     * @mbg.generated Sun Feb 11 18:24:59 CST 2018
     */
    public String getMethodTitle() {
        return methodTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_method.method_title
     *
     * @param methodTitle the value for public_method.method_title
     *
     * @mbg.generated Sun Feb 11 18:24:59 CST 2018
     */
    public void setMethodTitle(String methodTitle) {
        this.methodTitle = methodTitle == null ? null : methodTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_method.method_content
     *
     * @return the value of public_method.method_content
     *
     * @mbg.generated Sun Feb 11 18:24:59 CST 2018
     */
    public String getMethodContent() {
        return methodContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_method.method_content
     *
     * @param methodContent the value for public_method.method_content
     *
     * @mbg.generated Sun Feb 11 18:24:59 CST 2018
     */
    public void setMethodContent(String methodContent) {
        this.methodContent = methodContent == null ? null : methodContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_method.method_descr
     *
     * @return the value of public_method.method_descr
     *
     * @mbg.generated Sun Feb 11 18:24:59 CST 2018
     */
    public String getMethodDescr() {
        return methodDescr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_method.method_descr
     *
     * @param methodDescr the value for public_method.method_descr
     *
     * @mbg.generated Sun Feb 11 18:24:59 CST 2018
     */
    public void setMethodDescr(String methodDescr) {
        this.methodDescr = methodDescr == null ? null : methodDescr.trim();
    }
}