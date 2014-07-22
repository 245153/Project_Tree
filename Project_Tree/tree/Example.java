package tree;

import java.awt.Dimension;
import javax.swing.JFrame;


/**
 *樹状整列におけるメインクラス
 */
public class Example extends Object
{
    /**
     * 良好（2014年7月21日）
	 * @param arguments  javaコマンドによる実行時に指定された文字列
     */
    public static void main(String[] arguments)
	{
        TreeModel aTreeModel = new TreeModel();
        TreeController aTreeController = new TreeController();
        TreeView aTreeView = new TreeView(aTreeModel, aTreeController);
        JFrame aWindow = new JFrame("Tree");
        aWindow.getContentPane().add(aTreeView);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setMinimumSize(new Dimension(Constants.WINDOW_WIDTH / 2, Constants.WINDOW_HEIGHT / 2));
        aWindow.setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        aWindow.setVisible(true);
        return;
	}
}