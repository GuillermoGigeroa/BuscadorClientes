from clsGit import Git
from ruta import Variables

git = Git(Variables.getRuta())
git.status()