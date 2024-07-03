package org.my.com.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class BinaryTreeInorderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        log.info("Result : {}", inorderTraversal(root));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);
        return result;
    }

    public static void inorderTraversal(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        log.info("left : {}", root.left);
        inorderTraversal(root.left, result);
        log.info("val : {}", root.val);
        result.add(root.val);
        log.info("right : {}", root.right);
        inorderTraversal(root.right, result);
    }
}
