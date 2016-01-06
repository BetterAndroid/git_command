# 使用git for windows 之git-bash
1.git设置命令的别名：git config --global alias.co 'checkout' (co是要命名的别名，'checkout'是要被命名的命令) <br /> 
<br /> 
2.打标签(版本)：git tag -a 标签名 -m 标签的相关描述 or 打标签：git tag -a 标签名 :在vim中输入标签描述<br /> 
 提交单个标签：git push origin 标签名<br /> 
 提交多个个标签：git push origin --tags<br /> 
 查看本地版本：$ git tag <br /> 
 创建本地版本：$ git tag [name] <br /> 
 删除本地版本：$ git tag -d [name] <br /> 
 查看远程版本：$ git tag -r <br /> 
 创建远程版本(本地版本push到远程)：$ git push origin [name] <br /> 
 删除远程版本：$ git push origin :refs/tags/[name] <br /> 
 <br /> 
3,创建分支：git branch 新的分支名称<br /> 
 切换分支：git checkout 分支名称<br /> 
 提交分支：git commit --> git push origin 新的分支名称<br /> 
 合并分支：git merge testing(要合并的分支名称) --> git push 提交<br /> 
 删除分支：git branch -d testing(要删除的分支名称) --> git push 提交<br /> 
 删除远程分支：git push origin :heads/testing<br /> 
 查看本地分支：$ git branch<br /> 
 查看远程分支：$ git branch -r<br /> 
 <br /> 
4，vim编辑器使用方法：<br /> 
 进入到编辑器-->按i(Insert)进入到编辑模式-->编辑描述--> 编辑完成之后按esc进入指令模式-->输入:wq-->enter(保存并退出) <br /> 
 <br /> 
5,配置用户信息<br /> 
 a,git config --global user.name "xxxxxx" <br /> 
 b,git config --global user.email "xxxxx@xx.com" <br /> 
 <br /> 
6,配置默认文本编辑器:<br /> 
 git config --global core.editor "xxxxx" <br /> 
 <br /> 
7,git push 重复输入用户名和密码：(windows) <br /> 
 a,在环境变量新建用户变量-->key=HOME;value=%USERPROFILE% <br /> 
 b,在c:\user\xxx--> 新建文件(-netrc) <br />
 c,文件内容--> machine github.com login xxxxx password xxxx <br /> 
<br /> 
8.忽略一些文件、文件夹不提交<br /> 
 在仓库根目录下创建名称为“.gitignore”的文件，写入不需要的文件夹名或文件，每个元素占一行即可，如 <br /> 
 target <br /> 
 bin <br /> 
 *.db <br /> 
 <br />
9.git 提交代码：git commit -a :将修改的文件添加并提交 <br /> 
-->git 更新远程代码到本地：git pull --rebase <br /> 更新远程代码与本地的代码冲突-->解决之后 --> git add . -- 标记冲突解决 --> git pull --rebase 
-->git 提交本地的commit ：git push <br />
<br />
10.git status :当前的状态 <br />
<br />


 
 