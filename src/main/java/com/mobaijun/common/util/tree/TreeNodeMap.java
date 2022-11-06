package com.mobaijun.common.util.tree;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * software：IntelliJ IDEA 2022.1
 * class name: TreeNodeMap
 * description: 树节点包装
 *
 * @author MoBaiJun 2022/11/6 0:19
 */
public class TreeNodeMap extends LinkedHashMap<String, Object> implements Serializable {

    private static final long serialVersionUID = 8376668307601977428L;

    /**
     * 默认配置
     */
    private final TreeNodeConfig treeNodeConfig;

    /**
     * 构造器
     */
    public TreeNodeMap() {
        this.treeNodeConfig = TreeNodeConfig.getDefaultConfig();
    }

    public TreeNodeMap(TreeNodeConfig treeNodeConfig) {
        this.treeNodeConfig = treeNodeConfig;
    }

    @SuppressWarnings("unchecked")
    public <T> T getId() {
        return (T) super.get(treeNodeConfig.getIdKey());
    }

    public void setId(String id) {
        super.put(treeNodeConfig.getIdKey(), id);
    }

    @SuppressWarnings("unchecked")
    public <T> T getParentId() {
        return (T) super.get(treeNodeConfig.getParentIdKey());
    }

    public void setParentId(String parentId) {
        super.put(treeNodeConfig.getParentIdKey(), parentId);
    }

    @SuppressWarnings("unchecked")
    public <T> T getName() {
        return (T) super.get(treeNodeConfig.getNameKey());
    }

    public void setName(String name) {
        super.put(treeNodeConfig.getNameKey(), name);
    }

    @SuppressWarnings("unchecked")
    public <T> T getCode() {
        return (T) super.get(treeNodeConfig.getCodeKey());
    }

    public TreeNodeMap setCode(String code) {
        super.put(treeNodeConfig.getCodeKey(), code);
        return this;
    }

    @SuppressWarnings("unchecked")
    public List<TreeNodeMap> getChildren() {
        return (List<TreeNodeMap>) super.get(treeNodeConfig.getChildrenKey());
    }

    public void setChildren(List<TreeNodeMap> children) {
        super.put(treeNodeConfig.getChildrenKey(), children);
    }

    public void extra(String key, Object value) {
        super.put(key, value);
    }
}
