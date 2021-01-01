class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int srccolor = image[sr][sc];
        boolean[][] visited = new boolean[image.length][image[0].length];
        helper(image, sr,sc,newColor,visited,srccolor);    
        return image;
    }
    
    static int[][] helper(int[][] image, int sr, int sc, int newColor, boolean[][] visited, int srccolor){
        if(sr < 0 || sc < 0 || sr == image.length || sc == image[0].length || image[sr][sc] != srccolor || visited[sr][sc]){
            return image;
        }
        image[sr][sc] = newColor;
        visited[sr][sc] = true;
//     Top
        image = helper(image, sr-1,sc,newColor, visited, srccolor);
//     Left
        image = helper(image, sr,sc-1,newColor, visited, srccolor);
//     Down
        image = helper(image, sr+1,sc,newColor, visited, srccolor);
//     Right
        image = helper(image, sr,sc+1,newColor, visited, srccolor);
        
        visited[sr][sc] = false;
        return image;
    }
}
