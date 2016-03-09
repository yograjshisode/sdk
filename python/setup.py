import os
import yaml
from setuptools import setup, find_packages

# allow setup.py to be run from any path
os.chdir(os.path.normpath(os.path.join(os.path.abspath(__file__), os.pardir)))

AVI_PIP_VERSION = '16.1'
if os.path.exists("./VERSION"):
    with open("./VERSION", "r") as f:
        fs = yaml.load(f.read())
        AVI_PIP_VERSION = "%s.%s" % (fs["Version"], fs["build"])

setup(
    name = 'avi.sdk',
    version = AVI_PIP_VERSION,
    packages = find_packages(),
    description = 'Avi python sdk.',
    url = 'http://avinetworks.com/',
    author = 'Avi Networks',
    author_email = 'support@avinetworks.com',
    classifiers = [
        'Operating System :: OS Independent',
        'Programming Language :: Python',
        'Programming Language :: Python :: 2.7',
        'Topic :: Internet :: WWW/HTTP',
        'Topic :: Internet :: WWW/HTTP :: Dynamic Content',
    ],
    install_requires = ['requests'],
)

