# 使用git for windows 之git-bash
1.git设置命令的别名：git config --global alias.co 'checkout' (co是要命名的别名，'checkout'是要被命名的命令) <br /> 
2.打标签：git tag -a 标签名 -m 标签的相关描述 or 打标签：git tag -a 标签名 :在vim中输入标签描述<br /> 
 提交单个标签：git push origin 标签名<br /> 
 提交多个个标签：git push origin --tags<br /> 
3,创建分支：git branch 新的分支名称<br /> 
 切换分支：git checkout 分支名称<br /> 
 提交分支：git commit --> git push origin 新的分支名称<br /> 
 合并分支：git merge	testing(要合并的分支名称) --> git push 提交<br /> 
 删除分支：git merge	-d testing(要删除的分支名称) --> git push 提交<br /> 
4，vim编辑器使用方法：<br /> 
 进入到编辑器-->按i(Insert)进入到编辑模式-->编辑描述--> 编辑完成之后按esc进入指令模式-->输入:wq-->enter(保存并退出)<br /> 
5,配置用户信息<br /> 
 a,git config --global user.name "xxxxxx"<br /> 
 b,git config --global user.email "xxxxx@xx.com"<br /> 
6,配置默认文本编辑器:<br /> 
 git config --global core.editor "xxxxx"<br /> 
7,git push 重复输入用户名和密码：(windows)<br /> 
 a,在环境变量新建用户变量-->key=HOME;value=%USERPROFILE%<br /> 
 b,在c:\user\xxx--> 新建文件(-netrc)
 c,文件内容--> machine github.com login xxxxx password xxxx<br /> 
